package com.example.GestionStock.dto;

import com.example.GestionStock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private FournisseurDto fournisseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

    public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur){
        if(commandeFournisseur == null){

        }
    }
}
