package com.ideaas.dao;

import com.ideaas.domain.MapPoiEntidad;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapPoiEntidadDao extends PagingAndSortingRepository<MapPoiEntidad, Long> {
}
