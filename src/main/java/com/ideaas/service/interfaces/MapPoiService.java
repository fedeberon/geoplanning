package com.ideaas.service.interfaces;

import com.ideaas.domain.MapPoi;

import java.util.List;

public interface MapPoiService {

    MapPoi get(Long id);

    MapPoi save(MapPoi mapPoi);

    List<MapPoi> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
