package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.Client;
import com.abk.gestion.de.stock.entities.LigneCommandeClient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class CommandeClientDto {
    private Long id ;

    private String code ;
    private Instant dateCommande ;


    private Client client ;

    List<LigneCommandeClient> ligneCommandeClients ;
}
