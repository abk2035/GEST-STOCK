package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.Client;
import com.abk.gestion.de.stock.entities.CommandeClient;
import com.abk.gestion.de.stock.entities.LigneCommandeClient;
import lombok.*;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommandeClientDto {
    private Long id ;

    private String code ;

    private Instant dateCommande ;


    private ClientDto client ;

    List<LigneCommandeClientDto> ligneCommandeClients ;

    public static CommandeClientDto fromEntity(CommandeClient commandeClient){
      return  CommandeClientDto.builder()
              .id(commandeClient.getId())
              .code(commandeClient.getCode())
              .dateCommande(commandeClient.getDateCommande())
              .client(ClientDto.fromClient(commandeClient.getClient()))
              .build();
    }

    public static CommandeClient fromDto(CommandeClientDto commandeClientDto){
        CommandeClient commandeClient = new CommandeClient();
        BeanUtils.copyProperties(commandeClientDto,commandeClient);
        return commandeClient ;
    }
}
