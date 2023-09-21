package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.Adresse;
import com.abk.gestion.de.stock.entities.Client;
import com.abk.gestion.de.stock.entities.CommandeFournisseur;
import com.abk.gestion.de.stock.entities.Fournisseur;
import lombok.*;
import org.springframework.beans.BeanUtils;

import javax.persistence.Embedded;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FournisseurDto {
    private Long id ;

    private String nom ;
    private String prenom ;
    private String photo;
    private String email ;
    private  Long numTel ;

    private AdresseDto adresseDto ;

    List<CommandeFournisseurDto> commandeFournisseurDto;

    public FournisseurDto fromFournisseur(Fournisseur fournisseur){
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .email(fournisseur.getEmail())
                .photo(fournisseur.getPhoto())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .numTel(fournisseur.getNumTel())
                .build();
    }
    public Fournisseur fromFournisseurDto(FournisseurDto fournisseurDto){
        Fournisseur fournisseur = new Fournisseur() ;
        BeanUtils.copyProperties(fournisseurDto,fournisseur);
        return fournisseur ;
    }
}
