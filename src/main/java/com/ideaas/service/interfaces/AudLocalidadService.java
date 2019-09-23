package com.ideaas.service.interfaces;

import com.ideaas.domain.AudLocalidad;

import java.util.List;

public interface AudLocalidadService {

    AudLocalidad get(Long id);

    AudLocalidad save(AudLocalidad audLocalidad);

    List<AudLocalidad> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
