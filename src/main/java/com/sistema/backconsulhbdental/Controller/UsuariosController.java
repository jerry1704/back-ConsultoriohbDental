package com.sistema.backconsulhbdental.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuariosController {

    private final Logger logger = LoggerFactory.getLogger(UsuariosController.class);

    @GetMapping("/show")
    public String Show(){
        return "hola buen dia";
    }

    @GetMapping("/usersAll")
    public String userAll()
    {
        logger.info("Prueba para regresar los usuarios");
        return "";
    }
}

