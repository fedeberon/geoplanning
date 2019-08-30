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
@Table(name = "map_buses")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class MapBus {

    @Id
    @Column(name = "idMapBuses")
    private Long id;

    @Column(name = "linea")
    private String linea;

    @Column(name = "color")
    private String color;

    public MapBus() {
    }
}
