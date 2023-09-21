package com.abk.gestion.de.stock.dtos;


import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.Article;
import com.abk.gestion.de.stock.entities.TypeDeMvtStk;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MvStkDto  {
    private Long id ;

    private Instant dateMvt ;

    private double quantite ;


    private Article article ;

    private TypeDeMvtStk typeDeMvtStk ;
}
