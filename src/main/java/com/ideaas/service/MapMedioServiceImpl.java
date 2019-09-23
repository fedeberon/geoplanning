package com.ideaas.service;

import com.ideaas.dao.MapMedioDao;
import com.ideaas.domain.MapMedio;
import com.ideaas.service.interfaces.MapMedioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapMedioServiceImpl implements MapMedioService {

    private MapMedioDao dao;

    @Autowired
    public MapMedioServiceImpl(MapMedioDao dao) {
        this.dao = dao;
    }

    @Override
    public MapMedio get(Long id) {
        return dao.findById(id).get();
    }

    @Override
    public MapMedio save(MapMedio mapMedio) {
        return dao.save(mapMedio);
    }

    @Override
    public List<MapMedio> findAll(Integer pageSize, Integer pageNo, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Page<MapMedio> mapMedios = dao.findAll(paging);

        return mapMedios.getContent();
    }
}
