package com.clasedominio.domain;
// Paquete donde vive la clase de dominio. Debe coincidir con la ruta:

// src/main/java/com/clasedominio/domain

import lombok.Data;
// Importamos Lombok para usar @Data y evitar escribir getters/setters a mano.

@Data
// Lombok genera automáticamente:
// - getters y setters
// - toString()
// - equals() y hashCode()
public class Individuo {

    // Atributos privados: buena práctica (encapsulación)
    // Representan las características/datos del individuo.

    private String nombre; // Nombre del individuo (ej: "Diana")
    private String apellido; // Apellido del individuo (ej: "Delgado")
    private int edad; // Edad en años (ej: 25)
    private String correo; // Correo electrónico (ej: "dianadelgado@example.com")
}