package com.ideaas.service.interfaces;

import com.ideaas.domain.MapPoiSector;

import java.util.List;

public interface MapPoiSectorService {

    MapPoiSector get(Long id);

    MapPoiSector save(MapPoiSector mapPoiSector);

    List<MapPoiSector> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
