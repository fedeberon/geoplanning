package com.ideaas.dao;

import com.ideaas.domain.MapUbicacionAltura;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapUbicacionAlturaDao extends PagingAndSortingRepository<MapUbicacionAltura, Long> {
}
