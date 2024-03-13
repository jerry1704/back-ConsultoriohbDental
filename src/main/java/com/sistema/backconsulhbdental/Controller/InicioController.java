package com.sistema.backconsulhbdental.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InicioController {

    @GetMapping("/show")
    public String Show(){
        return "hola buen dia";
    }
}
