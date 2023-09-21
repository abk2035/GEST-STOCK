package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.Vente;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class LigneVenteDto {
    private Long id ;

    private Vente vente ;

    private double quantite ;

    private double prixUnitaire ;

}
