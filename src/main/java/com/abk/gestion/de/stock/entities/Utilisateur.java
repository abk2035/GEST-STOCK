package com.abk.gestion.de.stock.entities;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity{
    private String nom ;
    private String prenom ;
    private  String email ;

    private String motDePasse ;

    private Instant dateDeNaissance ;

    @Embedded
    private Adresse adresse ;

    private String photo ;

    @ManyToOne
    @JoinColumn(name = "idEntreprise")
    private Entreprise entreprise ;

    @OneToMany(mappedBy = "utilisateur")
    private List<Role> roles ;




}
