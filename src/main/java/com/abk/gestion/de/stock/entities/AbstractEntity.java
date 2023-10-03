package com.abk.gestion.de.stock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;


@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id ;

    @JsonIgnore
    @CreationTimestamp
    @Column(name = "creationDate")
    private Instant creationDate ;

    @JsonIgnore
    @UpdateTimestamp
    @Column(name = "lastModifiedDate")
    private Instant lastModifiedDate ;

}
