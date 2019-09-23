package com.ideaas.service.interfaces;

import com.ideaas.domain.AudCampania;

import java.util.List;

public interface AudCampaniaService {

    AudCampania get(Long id);

    AudCampania save(AudCampania audCampania);

    List<AudCampania> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
