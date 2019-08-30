package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "map_localidades")
@Getter
@Setter
@Builder
@AllArgsConstructor

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
