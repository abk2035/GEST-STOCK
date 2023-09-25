package com.abk.gestion.de.stock.entities;


import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "mvtStk")
public class MvStk extends AbstractEntity {
    private Instant dateMvt ;

    private double quantite ;

    private Long idEntreprise ;


    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article ;

    @Enumerated(EnumType.STRING)
    private TypeDeMvtStk typeDeMvtStk ;
}
