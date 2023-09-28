package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.Article;
import com.abk.gestion.de.stock.entities.CommandeClient;
import com.abk.gestion.de.stock.entities.LigneCommandeClient;
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

public class LigneCommandeClientDto  {
    private Long id ;


    private ArticleDto article ;

    private CommandeClient commandeClient ;

    public static LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient){
        return  LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())
                .article(ArticleDto.fromArticle(ligneCommandeClient.getArticle()))
                .commandeClient(ligneCommandeClient.getCommandeClient())
                .build();
    }

    public static LigneCommandeClient fromDto(LigneCommandeClientDto ligneCommandeClientDto){
        LigneCommandeClient ligneCommandeClient  = new LigneCommandeClient();
        BeanUtils.copyProperties(ligneCommandeClientDto,ligneCommandeClient);
        return ligneCommandeClient;
    }
}
