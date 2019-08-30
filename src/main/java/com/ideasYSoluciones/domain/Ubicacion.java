package com.ideasYSoluciones.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "map_ubicaciones")
@Getter
@Setter
@Builder
public class Ubicacion {

    @Id
    @Column(name = "idUbicacion")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "idElemento")
    private Elemento elemento;

    @ManyToOne
    @JoinColumn(name = "idFormato")
    private MapFormato formato;

    private Integer idMedio;
    private String direccion;
    private String nroAgip;
    private String referencia;
    private Integer nroAnuncio;
    private Integer idProvincia;
    private Integer idLocalidad;
    private String anunciante;
    private Integer cantidad;
    private String transito;
    private String iluminacion;
    private String medidas;
    private String m2;
    private String direccionNormalizada;
    private Double geoLatitud;
    private Double geoLongitud;
    private Integer metrosContacto;
    private BigDecimal coeficiente;
    private Integer zona;
    private String saturacion;
    private Integer visibilidad;
    private String circulacionPeatonal;
    private String circulacionVehicular;
    private String idReferencia;
    private Integer idMapBuses;
    private Byte bajaLogica;
    private Timestamp fechatransf;
    private Timestamp fechaAlta;
    private Integer idAltura;
    private Integer idVisibilidad;


}
