package com.abk.gestion.de.stock.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Adresse{

    private String adresse1 ;
    private String adresse2 ;
    private String ville ;
    private String codePostal ;
    private String pays ;
}
