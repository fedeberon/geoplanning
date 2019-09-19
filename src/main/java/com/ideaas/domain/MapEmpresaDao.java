package com.ideaas.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapEmpresaDao extends PagingAndSortingRepository<MapElemento, Long> {
}
