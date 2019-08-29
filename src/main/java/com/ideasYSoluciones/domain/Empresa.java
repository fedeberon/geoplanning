package com.ideasYSoluciones.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresas")
@Getter
@Setter
@Builder

public class Empresa {

    @Id
    @Column (name = "idEmpresa")
    private Long id;

    private String descripcion;
}
