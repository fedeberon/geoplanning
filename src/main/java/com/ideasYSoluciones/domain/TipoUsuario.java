package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tipo_usuarios")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class TipoUsuario {

    @Id
    @Column(name = "idTipoUsuario")
    private Long id;

    @Transient
    private String descripcion;

    public TipoUsuario() {
    }
}
