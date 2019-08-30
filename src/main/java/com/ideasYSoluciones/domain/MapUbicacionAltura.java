package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "map_ubicaciones_alturas")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class MapUbicacionAltura {

    @Id
    @Column(name = "id_altura")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "ponderador")
    private Double ponderador;

    public MapUbicacionAltura() {
    }
}
