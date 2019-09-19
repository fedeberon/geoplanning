package com.ideaas.restController;

import com.ideaas.domain.MapFormato;
import com.ideaas.service.interfaces.MapFormatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("mapFormato")
public class MapFormatoRestController {

    private MapFormatoService mapFormatoService;

    @Autowired
    public MapFormatoRestController(MapFormatoService mapFormatoService) {
        this.mapFormatoService = mapFormatoService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public MapFormato get(@PathVariable Long id){
        return mapFormatoService.get(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}/{pageNo}/{sortBy}")
    public List<MapFormato> findAll(@PathVariable Integer pageSize, @PathVariable Integer pageNo, @PathVariable String sortBy){
        return mapFormatoService.findAll(pageSize, pageNo, sortBy);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}/{pageNo}")
    public List<MapFormato> findAll(@PathVariable Integer pageSize, @PathVariable Integer pageNo){
        return mapFormatoService.findAll(pageSize, pageNo, "id");
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}")
    public List<MapFormato> findAll(@PathVariable Integer pageSize){
        return mapFormatoService.findAll(pageSize, 0, "id");
    }

    @PostMapping
    public ResponseEntity<MapFormato> save(@RequestBody MapFormato newMapFormato){
        MapFormato mapFormato = mapFormatoService.save(newMapFormato);

        return new ResponseEntity(mapFormato, HttpStatus.CREATED);
    }
}
