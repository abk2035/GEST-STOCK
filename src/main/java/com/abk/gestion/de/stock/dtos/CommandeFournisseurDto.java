package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.CommandeFournisseur;
import com.abk.gestion.de.stock.entities.Fournisseur;
import com.abk.gestion.de.stock.entities.LigneCommandeFournisseur;
import lombok.*;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommandeFournisseurDto  {
    private Long id ;

    private String code ;

    private Instant dateCommande ;

    private Fournisseur fournisseur ;

    List<LigneCommandeFournisseur> ligneCommandeFournisseur ;

    public  static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur){
      return   CommandeFournisseurDto.builder()
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                .fournisseur(commandeFournisseur.getFournisseur())
                .id(commandeFournisseur.getId())
                .build() ;
    }

    public  static  CommandeFournisseur fromDto (CommandeFournisseurDto commandeFournisseurDto){
        CommandeFournisseur commandeFournisseur = new CommandeFournisseur() ;
        BeanUtils.copyProperties(commandeFournisseurDto,commandeFournisseur);
        return commandeFournisseur ;
    }
}
