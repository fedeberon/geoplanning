package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "empresas")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class Empresa {

    @Id
    @Column(name = "idEmpresa")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    public Empresa() {
    }
}