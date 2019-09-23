package com.ideaas.service;

import com.ideaas.dao.AudCircuitoDao;
import com.ideaas.domain.AudCircuito;
import com.ideaas.service.interfaces.AudCircuitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudCircuitoServiceImpl implements AudCircuitoService {

    private AudCircuitoDao dao;

    @Autowired
    public AudCircuitoServiceImpl(AudCircuitoDao dao) {
        this.dao = dao;
    }

    @Override
    public List<AudCircuito> findAll(Integer pageSize, Integer pageNo, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Page<AudCircuito> audCircuitos = dao.findAll(paging);

        return audCircuitos.getContent();
    }

    @Override
    public AudCircuito get(Long id) { return dao.getOne(id); }

    @Override
    public AudCircuito save(AudCircuito audCircuito) { return dao.save(audCircuito); }
}
