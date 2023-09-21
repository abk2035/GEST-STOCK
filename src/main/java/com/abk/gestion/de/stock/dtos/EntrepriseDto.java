package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.Adresse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class EntrepriseDto  {
     private Long id ;

     private  String nom ;
     private  String description ;

     @Embedded
     private Adresse adresse ;

     private String codeFixcale ;
     private  String photo ;
     private  String email ;

}
