package com.abk.gestion.de.stock.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity {
    private String nom ;
    private String prenom ;
    private String photo;
    private String email ;
    private  Long numTel ;

    @Embedded
    private Adresse adresse ;

    private Long idEntreprise ;


    @OneToMany(mappedBy = "fournisseur")
    List<CommandeFournisseur> commandeFournisseur ;
}
