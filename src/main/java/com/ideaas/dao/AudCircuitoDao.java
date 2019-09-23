package com.ideaas.dao;

import com.ideaas.domain.AudCircuito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudCircuitoDao extends JpaRepository<AudCircuito, Long> {
}
