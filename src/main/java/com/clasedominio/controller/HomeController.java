package com.clasedominio.controller;

import com.clasedominio.domain.Individuo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {

        // Creamos una lista de individuos
        List<Individuo> lista = new ArrayList<>();

        // Individuo 1
        Individuo i1 = new Individuo();
        i1.setNombre("Angel");
        i1.setApellido("Ortiz");
        i1.setEdad(25);
        i1.setCorreo("angel@example.com");

        // Individuo 2
        Individuo i2 = new Individuo();
        i2.setNombre("Diana");
        i2.setApellido("Delgado");
        i2.setEdad(24);
        i2.setCorreo("diana@example.com");

        // Agregamos a la lista
        lista.add(i1);
        lista.add(i2);

        // Enviamos la lista a la vista con la clave "lista"
        model.addAttribute("lista", lista);

        // Renderiza templates/index.html
        return "index";
    }

    @GetMapping("/detalle")
    public String detalle(
            @RequestParam String nombre,
            @RequestParam String apellido,
            @RequestParam int edad,
            @RequestParam String correo,
            Model model) {
        // Creamos un Individuo con lo que llegó por URL
        Individuo individuo = new Individuo();
        individuo.setNombre(nombre);
        individuo.setApellido(apellido);
        individuo.setEdad(edad);
        individuo.setCorreo(correo);

        // Enviamos a la vista detalle.html
        model.addAttribute("individuo", individuo);

        return "detalle";
    }
}