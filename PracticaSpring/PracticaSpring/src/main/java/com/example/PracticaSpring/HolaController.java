package com.example.PracticaSpring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class HolaController {
    @PostMapping(
            path ="/saludo",
            //recibe informacion en formato JSON
            consumes = MediaType.APPLICATION_JSON_VALUE,

            //devuelve la info en formato JSON
            produces = MediaType.APPLICATION_JSON_VALUE)

    public Map<String ,String> saludar (@RequestBody Map<String, String>datos){
        String nombre = datos.get("nombre");
        String apellido = datos.get("apellido");

        String mensaje = "Hola "+nombre+" "+apellido+" Bienvenida a SpringBoot";
        return Map.of("mensaje",mensaje);
    }
}
