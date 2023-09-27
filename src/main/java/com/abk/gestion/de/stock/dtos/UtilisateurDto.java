package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

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
    private Adresse adresse;

    private String photo ;


    private Entreprise entreprise ;

    private List<Role> roles ;


    public  UtilisateurDto fromEntity(Utilisateur utilisateur){
        return  UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .email(utilisateur.getEmail())
                .dateDeNaissance(utilisateur.getDateDeNaissance())
                .prenom(utilisateur.getPrenom())
                .motDePasse(utilisateur.getMotDePasse())
                .entreprise(utilisateur.getEntreprise())
                .adresse(utilisateur.getAdresse())
                .build();
    }
    public Client fromClientDto(ClientDto clientDto){
        Client client = new Client() ;
        BeanUtils.copyProperties(clientDto,client);
        return  client;
    }

    public  Utilisateur fromUtilisateurDto(UtilisateurDto utilisateurDto){
        Utilisateur utilisateur = new Utilisateur();
        BeanUtils.copyProperties(utilisateurDto,utilisateur);
        return  utilisateur ;

    }

}
