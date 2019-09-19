package com.ideaas.dao;


import com.ideaas.domain.MapElemento;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapElementoDao extends PagingAndSortingRepository<MapElemento, Long> {
}
