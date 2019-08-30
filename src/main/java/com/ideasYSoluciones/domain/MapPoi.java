package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "map_pois")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class MapPoi {

    @Id
    @Column(name = "idPoi")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idEntidad")
    private MapPoiEntidad mapPoiEntidad;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idProvincia")
    private MapProvincia mapProvincia;

    @Column(name = "geo_latitud")
    private BigDecimal geoLatitud;

    @Column(name = "geo_longitud")
    private BigDecimal geoLongitud;

    @Column(name = "icono")
    private String icono;

    public MapPoi() {
    }
}
