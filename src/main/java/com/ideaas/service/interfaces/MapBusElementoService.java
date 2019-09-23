package com.ideaas.service.interfaces;

import com.ideaas.domain.MapBus;
import com.ideaas.domain.MapBusElemento;

import java.util.List;

public interface MapBusElementoService {

    MapBusElemento get(Long id);

    MapBusElemento save(MapBusElemento mapBusElemento);

    List<MapBusElemento> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
