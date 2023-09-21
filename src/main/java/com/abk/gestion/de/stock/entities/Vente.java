package com.abk.gestion.de.stock.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "vente")
public class Vente extends AbstractEntity{

    private String code ;

    private Instant dateVente ;

    private String commentaire ;

    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVentes ;
}
