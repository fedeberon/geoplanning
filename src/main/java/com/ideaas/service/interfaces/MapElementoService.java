package com.ideaas.service.interfaces;


import com.ideaas.domain.MapElemento;

import java.util.List;

public interface MapElementoService {

    MapElemento get(Long id);

    MapElemento save(MapElemento mapElemento);

    List<MapElemento> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
