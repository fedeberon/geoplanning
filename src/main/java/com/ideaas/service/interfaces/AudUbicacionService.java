package com.ideaas.service.interfaces;

import com.ideaas.domain.AudUbicacion;

import java.util.List;

public interface AudUbicacionService {

    AudUbicacion get(Long id);

    AudUbicacion save(AudUbicacion audUbicacion);

    List<AudUbicacion> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
