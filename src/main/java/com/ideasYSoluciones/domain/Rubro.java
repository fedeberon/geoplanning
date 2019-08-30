package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "rubros")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Rubro {

    @Id
    @Column(name = "idRubros")
    private Long id;

    @Transient
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "IDSector")
    private Sector sector;

    public Rubro() {
    }
}
