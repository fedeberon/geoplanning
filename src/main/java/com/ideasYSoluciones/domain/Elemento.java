package com.ideasYSoluciones.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "map_elementos")

public class Elemento {
    @Id
    @Column(name = "idElemento")
    private Long id;

    private String descripcion;
    private Long panos;


}
