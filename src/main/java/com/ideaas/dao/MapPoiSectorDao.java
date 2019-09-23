package com.ideaas.dao;

import com.ideaas.domain.MapPoiSector;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapPoiSectorDao extends PagingAndSortingRepository<MapPoiSector, Long> {
}
