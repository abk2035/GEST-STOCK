package com.abk.gestion.de.stock.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Table(name = "article")
public class Article extends AbstractEntity {
    private  String codeArticle ;

    private String designation;

    private String photo ;

    private double prixUnitaireHt;

    private double prixUnitaireTtc;

    private  double tauxTva ;

    private Long idEntreprise ;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category ;

    @OneToMany(mappedBy = "article")
    List<LigneCommandeClient> ligneCommandeClients ;

    @OneToMany(mappedBy = "article")
    List<LigneCommandeFournisseur> ligneCommandeFournisseurs ;

    @OneToMany(mappedBy = "article")
    List<LigneVentes> ligneVentes ;

    @OneToMany(mappedBy ="article" )
    List<MvStk> mvStks ;

}
