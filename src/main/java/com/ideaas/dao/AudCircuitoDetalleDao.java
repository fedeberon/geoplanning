package com.ideaas.dao;

import com.ideaas.domain.AudCircuitoDetalle;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudCircuitoDetalleDao extends PagingAndSortingRepository<AudCircuitoDetalle, Long> {
}
