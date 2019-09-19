package com.ideaas.domain;

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

    @Transient
    private String descripcion;

    @Transient
    private String estado;

    @Transient
    private String observacion;

    @Transient
    private String tipoContrato;

    public Contrato() {
    }
}
