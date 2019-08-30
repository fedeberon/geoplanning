package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "map_medios")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class MapMedio {

    @Id
    @Column(name = "idMedio")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    public MapMedio() {
    }
}
