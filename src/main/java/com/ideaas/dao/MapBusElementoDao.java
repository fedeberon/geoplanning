package com.ideaas.dao;

import com.ideaas.domain.MapBusElemento;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapBusElementoDao extends PagingAndSortingRepository<MapBusElemento, Long> {
}
