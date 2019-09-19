package com.ideaas.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contratos_mapping")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class ContratoMapping {

    @Id
    @Column(name = "idContratoMap")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idContrato")
    private Contrato contrato;

    @Transient
    private Long idEVP;

    public ContratoMapping() {
    }
}
