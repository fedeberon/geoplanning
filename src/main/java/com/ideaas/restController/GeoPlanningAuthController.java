package com.ideaas.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeoPlanningAuthController {

    @RequestMapping({"/hello"})
    public String firsPage() {
        return "Hola";
    }


}
