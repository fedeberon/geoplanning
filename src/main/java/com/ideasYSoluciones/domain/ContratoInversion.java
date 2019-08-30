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

    @Column(name = "fechaDesde")
    private String fechaDesde;

    @Column(name = "fechaHasta")
    private String fechaHasta;

    @Column(name = "creatividades")
    private String creatividades;

    public ContratoInversion() {
    }
}
