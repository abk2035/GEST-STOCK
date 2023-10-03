package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.Article;
import com.abk.gestion.de.stock.entities.LigneVentes;
import com.abk.gestion.de.stock.entities.Vente;
import lombok.*;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class LigneVentesDto {
    private Long id ;

    private Vente vente ;

    private Article article ;

    private double quantite ;

    private double prixUnitaire ;

    public static LigneVentesDto fromEntity(LigneVentes ligneVentes){
        return LigneVentesDto.builder()
                .id(ligneVentes.getId())
                .vente(ligneVentes.getVente())
                .article(ligneVentes.getArticle())
                .prixUnitaire(ligneVentes.getPrixUnitaire())
                .quantite(ligneVentes.getQuantite())
                .build();
    }

    public static LigneVentes fromDto(LigneVentesDto ligneVentesDto){
        LigneVentes ligneVentes = new LigneVentes();
        BeanUtils.copyProperties(ligneVentesDto,ligneVentes);
        return ligneVentes ;
    }

}
