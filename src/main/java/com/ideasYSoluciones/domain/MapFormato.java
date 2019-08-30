package com.ideasYSoluciones.domain;

import javax.persistence.Column;
import javax.persistence.Id;

public class MapFormato {

    @Id
    @Column(name = "idFormato")
    private Long id;

    private String descripcion;

    private Long evalua;

}
