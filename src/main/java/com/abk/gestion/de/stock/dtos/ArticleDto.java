package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.BeanUtils;


import java.util.List;

@Builder
@Data
public class ArticleDto {
    private Long id ;

    private  String codeArticle ;

    private String designation;

    private String photo ;

    private double prixUnitaireHt;

    private double prixUnitaireTtc;

    private  double tauxTva ;

    private Long idEntreprise ;


    private CategoryDto category ;

    List<LigneCommandeClientDto> ligneCommandeClients ;

    List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs ;

    List<MvStk> mvStks ;

    public static ArticleDto fromArticle (Article article){
        return  ArticleDto.builder()
                .id(article.getId())
                .idEntreprise(article.getIdEntreprise())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .build() ;
    }
    public static Article fromArticleDto(ArticleDto articleDto){
        Article article = new Article() ;
        BeanUtils.copyProperties(articleDto,article);
        return article ;
    }
}
