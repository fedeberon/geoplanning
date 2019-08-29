package com.ideasYSoluciones.domain;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "map_empresas")
public class MapEmpresa {

    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private Empresa empresa;

    private String descripcion;
    private String telefono;
    private String mail;
    private String logo;
    private Long orden;
    private String html;
    private Long gpmas;

}
