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
@Table(name = "map_pois_sector")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class MapPoiSector {

    @Id
    @Column(name = "idSectorPoi")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    public MapPoiSector() {
    }
}
