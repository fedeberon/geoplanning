package com.ideaas.service;

import com.ideaas.dao.MapBusDao;
import com.ideaas.domain.MapBus;
import com.ideaas.service.interfaces.MapBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapBusServiceImpl implements MapBusService {

    private MapBusDao dao;

    @Autowired
    public MapBusServiceImpl(MapBusDao dao) {
        this.dao = dao;
    }

    @Override
    public MapBus get(Long id) {
        return dao.findById(id).get();
    }

    @Override
    public MapBus save(MapBus mapBus) {
        return dao.save(mapBus);
    }

    @Override
    public List<MapBus> findAll(Integer pageSize, Integer pageNo, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Page<MapBus> mapBuses = dao.findAll(paging);

        return mapBuses.getContent();
    }
}
