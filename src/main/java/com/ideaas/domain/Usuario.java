package com.ideaas.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Usuario {

    @Id
    @Column(name = "idUsuario")
    private Long id;

    @Column(name = "usuario")
    private String username;

    @Column(name = "password")
    private String password;

    @Transient
    private String nombreCompleto;

    @Transient
    private String eMail;

    @Transient
    private String telefono;

    @Transient
    private String estado;

    @Transient
    private TipoUsuario tipoUsuario;

    @Transient
    private Anunciante mapAnunciante;

    @Transient
    private Producto producto;

    @Transient
    private String cargo;

    @Transient
    private ContratoInversion contratoInversion;

    @Transient
    private ContratoAuditoria contratoAuditoria;

    @Transient
    private ContratoMapping contratoMapping;

    public Usuario() { }
}
