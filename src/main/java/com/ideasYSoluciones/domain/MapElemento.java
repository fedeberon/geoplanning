package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "map_elementos")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class MapElemento {

    @Id
    @Column(name = "idElemento")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "panos")
    private Long panos;

    @ManyToOne
    @JoinColumn(name = "idMedio")
    private MapMedio mapMedio;

    @ManyToOne
    @JoinColumn(name = "idFormato")
    private MapFormato mapFormato;

    @Column(name = "acumulaDatos")
    private Long acumulaDatos;

    @Column(name = "evalua")
    private Long evalua;

    @Column(name = "metrosContacto")
    private Long metrosContacto;

    @Column(name = "coeficiente")
    private BigDecimal coeficiente;

    public MapElemento() {
    }
}
