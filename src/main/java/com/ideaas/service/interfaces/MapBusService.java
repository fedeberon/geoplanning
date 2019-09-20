package com.ideaas.service.interfaces;

import com.ideaas.domain.MapBus;

import java.util.List;

public interface MapBusService {

    MapBus get(Long id);

    MapBus save(MapBus mapBus);

    List<MapBus> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
