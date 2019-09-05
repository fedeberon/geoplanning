package com.ideasYSoluciones.dao;

import com.ideasYSoluciones.domain.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbicacionDao extends JpaRepository<Ubicacion, Long> {
}
