package com.example.GestionStock.dto;

import com.example.GestionStock.model.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private Integer id;
    private String codeArticle;


    private String designation;


    private BigDecimal prixUnitaireHt;


    private BigDecimal tauxTva;


    private BigDecimal prixUnitaireTtc;


    private String photo;

    private CategoryDto category;

    public static ArticleDto fromEntity(Article article){
        if(article == null){
            return null;
        }
        return ArticleDto.builder()
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .tauxTva(article.getTauxTva())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .build();
    }

    public static Article toEntity(ArticleDto articleDto){
        if (articleDto == null) {
            return null;
        }
        return Article.builder()
                .codeArticle(articleDto.getCodeArticle())
                .designation(articleDto.getDesignation())
                .prixUnitaireHt(articleDto.getPrixUnitaireHt())
                .tauxTva(articleDto.getTauxTva())
                .prixUnitaireTtc(articleDto.getPrixUnitaireTtc())
                .photo(articleDto.getPhoto())
                .build();
    }
}
