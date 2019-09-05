package com.ideasYSoluciones.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "map_buses_elementos")
@Data

public class MapBusElemento {

    @ManyToOne
    @JoinColumn(name = "idMapBuses")
    private MapBus mapBus;

    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private MapEmpresa mapEmpresa;

    @ManyToOne
    @JoinColumn(name = "idElemento")
    private MapElemento mapElemento;
}
