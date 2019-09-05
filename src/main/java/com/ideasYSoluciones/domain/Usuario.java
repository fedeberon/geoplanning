package com.ideasYSoluciones.domain;

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

    @Column(name = "nombreCompleto")
    private String nombreCompleto;

    @Column(name = "eMail")
    private String eMail;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "estado")
    private String estado;

//    @ManyToOne
//    @JoinColumn(name = "idTipoUsuario")
//    private TipoUsuario tipoUsuario;
//
//    @ManyToOne
//    @JoinColumn(name = "idAnunciante")
//    private MapAnunciante mapAnunciante;
//
//    @ManyToOne
//    @JoinColumn(name = "idProducto")
//    private Producto producto;
//
//    @Column(name = "cargo")
//    private String cargo;
//
//    @ManyToOne
//    @JoinColumn(name = "idContratoInv")
//    private ContratoInversion contratoInversion;
//
//    @ManyToOne
//    @JoinColumn(name = "idContratoAud")
//    private ContratoAuditoria contratoAuditoria;
//
//    @ManyToOne
//    @JoinColumn(name = "idContratoMap")
//    private ContratoMapping contratoMapping;

    public Usuario() { }
}
