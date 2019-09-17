package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contratos_auditoria")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class ContratoAuditoria {

    @Id
    @Column(name = "idContratoAud")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idContrato")
    private Contrato contrato;

    @Transient
    private String idCampanna;

    public ContratoAuditoria() {
    }
}
