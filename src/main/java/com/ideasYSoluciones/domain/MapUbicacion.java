package com.ideasYSoluciones.domain;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor

public class MapUbicacion {

    @Id
    @Column(name = "idUbicacion")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private MapEmpresa mapEmpresa;

    @ManyToOne
    @JoinColumn(name = "idElemento")
    private MapElemento mapElemento;

    @ManyToOne
    @JoinColumn(name = "idFormato")
    private MapFormato mapFormato;

    @ManyToOne
    @JoinColumn(name = "idMedio")
    private MapMedio mapMedio;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "nro_agip")
    private String nroAgip;

    @Column(name = "Referencia")
    private String referencia;

    @Column(name = "Nro_Anuncio")
    private Long nroAnuncio;

    @ManyToOne
    @JoinColumn(name = "idProvincia")
    private MapProvincia mapProvincia;

    @ManyToOne
    @JoinColumn(name = "idLocalidad")
    private MapLocalidad mapLocalidad;

    @ManyToOne
    @JoinColumn(name = "idAnunciante")
    private MapAnunciante mapAnunciante;

    @Column(name = "cantidad")
    private Long cantidad;

    @Column(name = "transito")
    private String transito;

    @Column(name = "iluminacion")
    private String iluminacion;

    @Column(name = "Medidas")
    private String medidas;

    @Column(name = "M2")
    private String m2;

    @Column(name = "Direccion_Normalizada")
    private String direccionNormalizada;

    @Column(name = "geo_latitud")
    private Double geoLatitud;

    @Column(name = "geo_longitud")
    private Double geoLongitud;

    @Column(name = "metroscontacto")
    private Long metrosContacto;

    @Column(name = "coeficiente")
    private BigDecimal coeficiente;

    @Column(name = "zona")
    private Long zona;

    @Column(name = "Saturacion")
    private String saturacion;

    @Column(name = "visibilidad")
    private Long visibilidad;

    @Column(name = "circulacion_peatonal")
    private String circulacionPeatonal;

    @Column(name = "Circulacion_Vehicular")
    private String circulacionVehicular;

    @Column(name = "id_referencia")
    private String idReferencia;

    @ManyToOne
    @JoinColumn(name = "idMapBuses")
    private MapBus idMapBuses;

    @Column(name = "bajaLogica")
    private Byte bajaLogica;

    @Column(name = "fechatransf")
    private Timestamp fechatransf;

    @Column(name = "fecha_alta")
    private Timestamp fechaAlta;

    @ManyToOne
    @JoinColumn(name = "id_altura")
    private MapUbicacionAltura mapUbicacionAltura;

    @ManyToOne
    @JoinColumn(name = "id_visibilidad")
    private MapUbicacionVisibilidad mapUbicacionVisibilidad;

    public MapUbicacion() {
    }
}
