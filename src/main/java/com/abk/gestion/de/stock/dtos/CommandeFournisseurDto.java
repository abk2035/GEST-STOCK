package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.Fournisseur;
import com.abk.gestion.de.stock.entities.LigneCommandeFournisseur;
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
public class CommandeFournisseurDto  {
    private Long id ;

    private String code ;
    private Instant dateCommande ;


    private Fournisseur fournisseur ;

    List<LigneCommandeFournisseur> ligneCommandeFournisseur ;
}
