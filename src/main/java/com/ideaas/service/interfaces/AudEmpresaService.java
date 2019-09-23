package com.ideaas.service.interfaces;

import com.ideaas.domain.AudEmpresa;

import java.util.List;

public interface AudEmpresaService {

    AudEmpresa get(Long id);

    AudEmpresa save(AudEmpresa audEmpresa);

    List<AudEmpresa> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
