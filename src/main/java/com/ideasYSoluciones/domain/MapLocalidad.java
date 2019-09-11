package com.ideasYSoluciones.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "map_localidades")
@Data

public class MapLocalidad {

    @Id
    @Column (name = "idLocalidad")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn (name = "idProvincia")
    private MapProvincia mapProvincia;

    public MapLocalidad() {
    }
}
