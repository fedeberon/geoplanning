package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "sectores")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Sector {

    @Id
    @Column(name = "IDSector")
    private Long id;

    @Transient
    private String descripcion;

    public Sector() {
    }
}
