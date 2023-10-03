package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.Vente;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VenteDto {
    private Long id ;

    private Long idEntreprise ;

    private String code ;

    private Instant dateVente ;

    private String commentaire ;

    private List<LigneVentesDto> ligneVentes ;

    public static VenteDto fromEntity(Vente vente){
        return  VenteDto.builder()
                .id(vente.getId())
                .idEntreprise(vente.getIdEntreprise())
                .code(vente.getCode())
                .commentaire(vente.getCommentaire())
                .dateVente(vente.getDateVente())
                .build();
    }

    public static Vente fromDto(VenteDto venteDto){
        Vente vente = new Vente();
        BeanUtils.copyProperties(venteDto,vente);
        return vente ;
    }
}
