package com.ideaas.service.interfaces;

import com.ideaas.domain.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioService extends UserDetailsService {

    Usuario get(Long id);

    Usuario save(Usuario usuario);

    List<Usuario> findAll(Integer pageSize, Integer pageNo, String sortBy);
}
