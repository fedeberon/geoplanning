package com.ideaas.dao;

import com.ideaas.domain.MapUbicacion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapUbicacionDao extends PagingAndSortingRepository<MapUbicacion, Long> {
}
