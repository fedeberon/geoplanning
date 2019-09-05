package com.ideasYSoluciones.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "map_buses_recorridos")
@Data
public class MapBusRecorrido {

    @Id
    @Column(name = "idRecorrido")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idMapBuses")
    private MapBus mapBus;

    @Column(name = "recorrido")
    private String recorrido;

    @Column(name = "duracion_minutos")
    private Long duracionMinutos;

    @Column(name = "unidades_circulacion_01")
    private Long unidadesCirculacion01;

    public MapBusRecorrido() {
    }
}
