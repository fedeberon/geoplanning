package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contratos")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class Contrato {

    @Id
    @Column(name = "idContrato")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private String estado;

    @Column(name = "observacion")
    private String observacion;

    @Column(name = "tipoContrato")
    private String tipoContrato;

    public Contrato() {
    }
}
