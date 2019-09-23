package com.ideaas.service.interfaces;

import com.ideaas.domain.MapMedio;

import java.util.List;

public interface MapMedioService {

    MapMedio get(Long id);

    MapMedio save(MapMedio mapMedio);

    List<MapMedio> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
