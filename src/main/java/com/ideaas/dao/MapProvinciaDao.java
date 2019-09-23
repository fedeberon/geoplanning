package com.ideaas.dao;

import com.ideaas.domain.MapProvincia;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapProvinciaDao extends PagingAndSortingRepository<MapProvincia, Long> {
}
