package com.abk.gestion.de.stock.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity {
     private  String nom ;
     private  String description ;

     @Embedded
     private Adresse adresse ;

     private String codeFixcale ;
     private  String photo ;
     private  String email ;

}
