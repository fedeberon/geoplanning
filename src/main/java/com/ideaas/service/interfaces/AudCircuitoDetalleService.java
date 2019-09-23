package com.ideaas.service.interfaces;

import com.ideaas.domain.AudCircuitoDetalle;

import java.util.List;

public interface AudCircuitoDetalleService {

    AudCircuitoDetalle get(Long id);

    AudCircuitoDetalle save(AudCircuitoDetalle audCircuitoDetalle);

    List<AudCircuitoDetalle> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
