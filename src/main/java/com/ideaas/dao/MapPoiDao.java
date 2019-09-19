package com.ideaas.dao;

import com.ideaas.domain.MapPoi;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapPoiDao extends PagingAndSortingRepository<MapPoi, Long> {
}
