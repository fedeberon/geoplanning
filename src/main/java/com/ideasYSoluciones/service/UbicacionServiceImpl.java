package com.ideasYSoluciones.service;

import com.ideasYSoluciones.dao.UbicacionDao;
import com.ideasYSoluciones.domain.Ubicacion;
import com.ideasYSoluciones.service.interfaces.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionServiceImpl implements UbicacionService {

    private UbicacionDao dao;

    @Autowired
    public UbicacionServiceImpl(UbicacionDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Ubicacion> findAll() {
        return dao.findAll();
    }

    @Override
    public Ubicacion get(Long id) {
        return dao.getOne(id);
    }

    @Override
    public Ubicacion save(Ubicacion ubicacion) {
        return dao.save(ubicacion);
    }

}
