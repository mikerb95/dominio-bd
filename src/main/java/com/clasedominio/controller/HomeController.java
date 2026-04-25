package com.clasedominio.controller;

import com.clasedominio.domain.Individuo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController { // Nombre de clase debe coincidir con el archivo

    @GetMapping("/")
    public String index(Model model) {

        // Creamos el objeto de dominio
        Individuo individuo = new Individuo();

        // Asignamos valores
        individuo.setNombre("Angel");
        individuo.setApellido("Ortiz");
        individuo.setEdad(25);
        individuo.setCorreo("angel@example.com");

        // Imprimimos el objeto (toString de Lombok @Data)
        System.out.println(individuo);

        // Enviamos el objeto a la vista
        model.addAttribute("individuo", individuo);

        // Renderiza templates/index.html
        return "index";
    }
}