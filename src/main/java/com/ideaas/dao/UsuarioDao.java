package com.ideaas.dao;

import com.ideaas.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
