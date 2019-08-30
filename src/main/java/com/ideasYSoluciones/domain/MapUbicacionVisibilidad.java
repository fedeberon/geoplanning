package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "map_ubicaciones_visibilidades")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class MapUbicacionVisibilidad {

    @Id
    @Column(name = "id_visibilidad")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "ponderador")
    private Double ponderador;

    public MapUbicacionVisibilidad() {
    }
}
