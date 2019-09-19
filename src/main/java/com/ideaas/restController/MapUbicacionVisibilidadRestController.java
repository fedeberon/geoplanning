package com.ideaas.restController;

import com.ideaas.domain.MapUbicacionVisibilidad;
import com.ideaas.service.interfaces.MapUbicacionVisibilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/mapUbicacionVisibilidad")
public class MapUbicacionVisibilidadRestController {

    private MapUbicacionVisibilidadService mapUbicacionVisibilidadService;

    @Autowired
    public MapUbicacionVisibilidadRestController(MapUbicacionVisibilidadService mapUbicacionVisibilidadService) {
        this.mapUbicacionVisibilidadService = mapUbicacionVisibilidadService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public MapUbicacionVisibilidad get(@PathVariable Long id){
        return mapUbicacionVisibilidadService.get(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}/{pageNo}/{sortBy}")
    public List<MapUbicacionVisibilidad> findAll(@PathVariable Integer pageSize, @PathVariable Integer pageNo, @PathVariable String sortBy){
        return mapUbicacionVisibilidadService.findAll(pageSize, pageNo, sortBy);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}/{pageNo}")
    public List<MapUbicacionVisibilidad> findAll(@PathVariable Integer pageSize, @PathVariable Integer pageNo){
        return mapUbicacionVisibilidadService.findAll(pageSize, pageNo, "id");
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}")
    public List<MapUbicacionVisibilidad> findAll(@PathVariable Integer pageSize){
        return mapUbicacionVisibilidadService.findAll(pageSize, 0, "id");
    }

    @PostMapping
    public ResponseEntity<MapUbicacionVisibilidad> save(@RequestBody MapUbicacionVisibilidad newMapUbicacionVisibilidad){
        MapUbicacionVisibilidad mapUbicacionVisibilidad = mapUbicacionVisibilidadService.save(newMapUbicacionVisibilidad);

        return new ResponseEntity(mapUbicacionVisibilidad, HttpStatus.CREATED);
    }
}
