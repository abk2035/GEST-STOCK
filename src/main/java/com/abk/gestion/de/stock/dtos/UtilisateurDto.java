package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.Adresse;
import com.abk.gestion.de.stock.entities.Entreprise;
import com.abk.gestion.de.stock.entities.Role;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurDto {
    private Long id ;

    private String nom ;
    private String prenom ;
    private  String email ;

    private String motDePasse ;

    private Instant dateDeNaissance ;

    @Embedded
    private Adresse adresse ;

    private String photo ;


    private Entreprise entreprise ;

    private List<Role> roles ;


}
