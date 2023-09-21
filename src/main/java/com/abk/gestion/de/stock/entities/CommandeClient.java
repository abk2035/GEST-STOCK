package com.abk.gestion.de.stock.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Table(name = "commandeClient")
public class CommandeClient extends AbstractEntity {
    private String code ;
    private Instant dateCommande ;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private  Client client ;

    @OneToMany(mappedBy = "commandeClient")
    List<LigneCommandeClient> ligneCommandeClients ;
}
