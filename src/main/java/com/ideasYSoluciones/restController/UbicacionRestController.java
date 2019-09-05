package com.ideasYSoluciones.restController;


import com.ideasYSoluciones.domain.Ubicacion;
import com.ideasYSoluciones.service.interfaces.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ubicacion")
public class UbicacionRestController {

    private UbicacionService ubicacionService;

    @Autowired
    public UbicacionRestController(UbicacionService ubicacionService) {
        this.ubicacionService = ubicacionService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Ubicacion get(@PathVariable Long id){
        return ubicacionService.get(id);
    }


    @PostMapping("/")
    public ResponseEntity<Ubicacion> save(@RequestBody Ubicacion newUbicacion){
        Ubicacion ubicacion = ubicacionService.save(newUbicacion);

        return new ResponseEntity(ubicacion, HttpStatus.CREATED);
    }



}
