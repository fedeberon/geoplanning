package com.ideasYSoluciones.dao;

import com.ideasYSoluciones.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
