package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.Adresse;
import com.abk.gestion.de.stock.entities.CommandeFournisseur;
import lombok.*;

import javax.persistence.Embedded;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FournisseurDto {
    private String nom ;
    private String prenom ;
    private String photo;
    private String email ;
    private  Long numTel ;

    @Embedded
    private Adresse adresse ;

    List<CommandeFournisseur> commandeFournisseur ;

}
