package com.ideaas.service.interfaces;

import com.ideaas.domain.MapPoiEntidad;

import java.util.List;

public interface MapPoiEntidadService {

    MapPoiEntidad get(Long id);

    MapPoiEntidad save(MapPoiEntidad mapPoiEntidad);

    List<MapPoiEntidad> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
