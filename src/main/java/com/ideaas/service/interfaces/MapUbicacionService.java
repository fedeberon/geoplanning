package com.ideaas.service.interfaces;

import com.ideaas.domain.MapUbicacion;

import java.util.List;

public interface MapUbicacionService {

    MapUbicacion get(Long id);

    MapUbicacion save(MapUbicacion mapUbicacion);

    List<MapUbicacion> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
