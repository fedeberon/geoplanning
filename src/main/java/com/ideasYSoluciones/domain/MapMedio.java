package com.ideasYSoluciones.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "map_medios")

public class MapMedio {

    @Id
    @Column(name = "idMedio")
    private Long id;

    private String descripcion;
}
