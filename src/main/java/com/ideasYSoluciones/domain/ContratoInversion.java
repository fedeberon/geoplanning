package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contratos_inversion")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class ContratoInversion {

    @Id
    @Column(name = "idContratoInv")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idContrato")
    private Contrato contrato;

    @ManyToOne
    @JoinColumn(name = "idRubro")
    private Rubro rubro;

    @Transient
    private String fechaDesde;

    @Transient
    private String fechaHasta;

    @Transient
    private String creatividades;

    public ContratoInversion() {
    }
}
