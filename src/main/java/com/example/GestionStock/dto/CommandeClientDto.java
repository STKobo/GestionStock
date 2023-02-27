package com.example.GestionStock.dto;


import com.example.GestionStock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private ClientDto client;

    private List<LigneCommandeClientDto> ligneCommandeClients;

    public static CommandeClientDto fromEntity(CommandeClient commandeClients){
        if(commandeClients == null){
            return null;
        }
        return CommandeClientDto.builder()
                .code(commandeClients.getCode())
                .dateCommande(commandeClients.getDateCommande())
                .client(commandeClients.getClient())
                .ligneCommandeClients(commandeClients.getLigneCommandeClients())
                .build();
    }

    public static CommandeClient toEntity(CommandeClientDto commandeClientDto){
        if(commandeClientDto == null){

        }
        return CommandeClient.builder()
                .code(commandeClientDto.getCode())
                .dateCommande(commandeClientDto.getDateCommande())
                .client(commandeClientDto.getClient())
                .ligneCommandeClients(commandeClientDto.getLigneCommandeClients())
                .build();
    }
}
