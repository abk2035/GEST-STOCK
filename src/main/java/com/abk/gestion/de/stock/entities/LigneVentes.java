package com.abk.gestion.de.stock.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "ligneVente")
public class LigneVentes extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "idVente")
    private Vente vente ;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private  Article article ;

    private double quantite ;

    private double prixUnitaire ;

}
