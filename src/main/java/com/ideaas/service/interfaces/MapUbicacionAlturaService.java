package com.ideaas.service.interfaces;

import com.ideaas.domain.MapUbicacionAltura;

import java.util.List;

public interface MapUbicacionAlturaService {

    MapUbicacionAltura get(Long id);

    MapUbicacionAltura save(MapUbicacionAltura mapUbicacionAltura);

    List<MapUbicacionAltura> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
