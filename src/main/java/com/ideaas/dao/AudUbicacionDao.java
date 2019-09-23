package com.ideaas.dao;

import com.ideaas.domain.AudUbicacion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudUbicacionDao extends PagingAndSortingRepository<AudUbicacion, Long> {
}
