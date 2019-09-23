package com.ideaas.restController;

import com.ideaas.domain.MapElemento;
import com.ideaas.service.interfaces.MapElementoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/mapElemento")
public class MapElementoRestController {

    private MapElementoService mapElementoService;

    @Autowired
    public MapElementoRestController(MapElementoService mapElementoService) {
        this.mapElementoService = mapElementoService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public MapElemento get(@PathVariable Long id){
        return mapElementoService.get(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/list/{pageSize}/{pageNo}/{sortBy}")
    public List<MapElemento> findAll(@PathVariable Integer pageSize, @PathVariable Integer pageNo, @PathVariable String sortBy){
        return mapElementoService.findAll(pageSize, pageNo, sortBy);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/list/{pageSize}/{pageNo}")
    public List<MapElemento> findAll(@PathVariable Integer pageSize, @PathVariable Integer pageNo){
        return mapElementoService.findAll(pageSize, pageNo, "id");
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/list/{pageSize}")
    public List<MapElemento> findAll(@PathVariable Integer pageSize){
        return mapElementoService.findAll(pageSize, 0, "id");
    }

    @PostMapping
    public ResponseEntity<MapElemento> save(@RequestBody MapElemento newMapElemento){
        MapElemento mapElemento = mapElementoService.save(newMapElemento);

        return new ResponseEntity(mapElemento, HttpStatus.CREATED);
    }
}
