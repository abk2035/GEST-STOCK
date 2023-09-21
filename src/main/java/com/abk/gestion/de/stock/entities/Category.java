package com.abk.gestion.de.stock.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Table(name = "category")
public class Category extends AbstractEntity {
    private String code;
    private String designation ;

    @OneToMany(mappedBy ="category")
    private List<Article> articles;

}
