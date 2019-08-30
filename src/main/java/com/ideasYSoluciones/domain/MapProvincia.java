package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "map_provincias")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class MapProvincia {
    @Id
    @Column(name = "idProvincia")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "evalua")
    private Long evalua;

    public MapProvincia() {
    }
}
