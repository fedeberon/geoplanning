package com.ideaas.dao;

import com.ideaas.domain.MapUbicacionVisibilidad;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapUbicacionVisibilidadDao extends PagingAndSortingRepository<MapUbicacionVisibilidad, Long> {
}
