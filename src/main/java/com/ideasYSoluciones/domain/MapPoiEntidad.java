package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "map_pois_entidad")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class MapPoiEntidad {

    @Id
    @Column(name = "idEntidad")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idSector")
    private MapPoiSector mapPoiSector;

    @Column(name = "descripcion")
    private String descripcion;

    public MapPoiEntidad() {
    }
}
