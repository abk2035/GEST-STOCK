package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.LigneVente;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VenteDto extends AbstractEntity {
    private Long id ;


    private String code ;

    private Instant dateVente ;

    private String commentaire ;

    private List<LigneVenteDto> ligneVentesDto ;
}
