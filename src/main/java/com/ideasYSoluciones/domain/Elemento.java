package com.ideasYSoluciones.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "map_elementos")

public class Elemento {
    @Id
    @Column(name = "idElemento")
    private Long id;

    private String descripcion;
    private Long panos;

    @ManyToOne
    @JoinColumn(name = "idMedio")
    private MapMedio medio;

    @ManyToOne
    @JoinColumn(name = "idFormato")
    private MapFormato formato;

    private Long evalua;

    private Long metrosContacto;

    private BigDecimal coeficiente;

}
