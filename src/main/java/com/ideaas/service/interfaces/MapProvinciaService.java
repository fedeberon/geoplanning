package com.ideaas.service.interfaces;

import com.ideaas.domain.MapProvincia;

import java.util.List;

public interface MapProvinciaService {

    MapProvincia get(Long id);

    MapProvincia save(MapProvincia mapProvincia);

    List<MapProvincia> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
