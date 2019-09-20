package com.ideaas.restController;

import com.ideaas.domain.Usuario;
import com.ideaas.service.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuario")
public class UsuarioRestController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioRestController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Usuario get(@PathVariable Long id){
        return usuarioService.get(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}/{pageNo}/{sortBy}")
    public List<Usuario> findAll(@PathVariable Integer pageSize, @PathVariable Integer pageNo, @PathVariable String sortBy){
        return usuarioService.findAll(pageSize, pageNo, sortBy);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}/{pageNo}")
    public List<Usuario> findAll(@PathVariable Integer pageSize, @PathVariable Integer pageNo){
        return usuarioService.findAll(pageSize, pageNo, "id");
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}")
    public List<Usuario> findAll(@PathVariable Integer pageSize){
        return usuarioService.findAll(pageSize, 0, "id");
    }

    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody Usuario newMapUsuario){
        Usuario usuario = usuarioService.save(newMapUsuario);

        return new ResponseEntity(usuario, HttpStatus.CREATED);
    }
}
