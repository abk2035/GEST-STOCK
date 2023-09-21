package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.Category;
import com.abk.gestion.de.stock.entities.LigneCommandeClient;
import com.abk.gestion.de.stock.entities.LigneCommandeFournisseur;
import com.abk.gestion.de.stock.entities.MvStk;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
public class ArticleDto {
    private Long id ;

    private  String codeArticle ;
    private String Designation;
    private String photo ;
    private double prixUnitaire;
    private  double tauxTva ;


    private Category category ;

    List<LigneCommandeClient> ligneCommandeClients ;

    List<LigneCommandeFournisseur> ligneCommandeFournisseurs ;

    List<MvStk> mvStks ;
}
