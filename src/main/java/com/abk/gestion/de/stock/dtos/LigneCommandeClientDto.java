package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.Article;
import com.abk.gestion.de.stock.entities.CommandeClient;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class LigneCommandeClientDto  {
    private Long id ;


    private Article article ;

    private CommandeClient commandeClient ;
}
