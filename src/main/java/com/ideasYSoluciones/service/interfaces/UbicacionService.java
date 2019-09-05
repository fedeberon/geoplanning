package com.ideasYSoluciones.service.interfaces;

import com.ideasYSoluciones.domain.Ubicacion;

import java.util.List;

public interface UbicacionService {

    List<Ubicacion> findAll();

    Ubicacion get(Long id);

    Ubicacion save(Ubicacion ubicacion);
}
