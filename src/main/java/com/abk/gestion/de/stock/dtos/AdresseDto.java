package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.Adresse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.Embeddable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class AdresseDto {

    private String adresse1 ;
    private String adresse2 ;
    private String ville ;
    private String codePostal ;
    private String pays ;

    public AdresseDto fromAdresse(Adresse adresse){
        return  AdresseDto.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .codePostal(adresse.getCodePostal())
                .pays(adresse.getPays())
                .ville(adresse.getVille())
                .build() ;
    }

    public Adresse fromAdresseDto(AdresseDto adresseDto){
        Adresse adresse = new Adresse() ;
        BeanUtils.copyProperties(adresseDto,adresse);
        return  adresse ;
    }
}
