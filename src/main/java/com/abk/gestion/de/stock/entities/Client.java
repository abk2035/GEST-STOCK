package com.abk.gestion.de.stock.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "client")
public class Client extends AbstractEntity {
    private String nom ;
    private String prenom ;
    private String photo;
    private String email ;
    private  Long numTel ;

    @Embedded
    private Adresse adresse ;

    @OneToMany(mappedBy = "client")
    List<CommandeClient> commandeClients ;

}
