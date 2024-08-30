package com.sistema.backconsulhbdental.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacientesController {

    private final Logger logger = LoggerFactory.getLogger(PacientesController.class);

    @GetMapping("/show")
    public String Show(){
        return "hola buen dia";
    }

    @GetMapping("/pacienteId")
    public String pacienteId()
    {
        logger.info("Prueba regresa Pacientes");
        return "";
    }
}
