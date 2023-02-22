package com.example.GestionStock.dto;


import com.example.GestionStock.model.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String mail;

    private String numTel;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    public static ClientDto fromEntity(Client client{
        if(client== null){
            return null;
        }
        return ClientDto.builder()
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adresse(client.getAdresse())
                .photo(client.getPhoto())
                .mail(client.getMail())
                .numTel(client.getNumTel())
                .commandeClients(client.getCommandeClients())
                .build();
    }
    public static Client toEntity(ClientDto clientDto){
        if(clientDto == null){
            return null;
        }
        return Client.builder()
                .nom(clientDto.getNom())
                .prenom(clientDto.getPrenom())
                .adresse(clientDto.getAdresse())
                .photo(clientDto.getPhoto())
                .mail(clientDto.getMail())
                .numTel(clientDto.getNumTel())
                .commandeClients(clientDto.getCommandeClients())
                .build();
    }
}
