package com.abk.gestion.de.stock.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "role")
public class Role extends AbstractEntity {
  private String roleName ;

  @ManyToOne
  @JoinColumn(name = "idUtilisateur")
  private Utilisateur utilisateur ;
}
