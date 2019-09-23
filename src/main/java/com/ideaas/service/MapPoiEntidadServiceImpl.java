package com.ideaas.service;

import com.ideaas.dao.MapPoiEntidadDao;
import com.ideaas.domain.MapPoiEntidad;
import com.ideaas.service.interfaces.MapPoiEntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapPoiEntidadServiceImpl implements MapPoiEntidadService {

    private MapPoiEntidadDao dao;

    @Autowired
    public MapPoiEntidadServiceImpl(MapPoiEntidadDao dao) {
        this.dao = dao;
    }

    @Override
    public MapPoiEntidad get(Long id) {
        return dao.findById(id).get();
    }

    @Override
    public MapPoiEntidad save(MapPoiEntidad mapPoiEntidad) {
        return dao.save(mapPoiEntidad);
    }

    @Override
    public List<MapPoiEntidad> findAll(Integer pageSize, Integer pageNo, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Page<MapPoiEntidad> mapPoisEntidades = dao.findAll(paging);

        return mapPoisEntidades.getContent();
    }
}
