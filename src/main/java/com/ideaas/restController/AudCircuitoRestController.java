package com.ideaas.restController;

import com.ideaas.domain.AudCircuito;
import com.ideaas.service.interfaces.AudCircuitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("audCircuito")
public class AudCircuitoRestController {

    private AudCircuitoService audCircuitoService;

    @Autowired
    public AudCircuitoRestController(AudCircuitoService audCircuitoService) {
        this.audCircuitoService = audCircuitoService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public AudCircuito get(@PathVariable Long id){
        return audCircuitoService.get(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}/{pageNo}/{sortBy}")
    public List<AudCircuito> findAll(@PathVariable Integer pageSize, @PathVariable Integer pageNo, @PathVariable String sortBy){
        return audCircuitoService.findAll(pageSize, pageNo, sortBy);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}/{pageNo}")
    public List<AudCircuito> findAll(@PathVariable Integer pageSize, @PathVariable Integer pageNo){
        return audCircuitoService.findAll(pageSize, pageNo, "id");
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/obtener/{pageSize}")
    public List<AudCircuito> findAll(@PathVariable Integer pageSize){
        return audCircuitoService.findAll(pageSize, 0, "id");
    }
    @PostMapping("/")
    public ResponseEntity<AudCircuito> save(@RequestBody AudCircuito newAudCircuito){
        AudCircuito audCircuito = audCircuitoService.save(newAudCircuito);

        return new ResponseEntity(audCircuito, HttpStatus.CREATED);
    }



}
