package com.clasedominio.domain;

import jakarta.persistence.*;

// Importo Lombok para generar automáticamente getters, setters, toString, etc.
import lombok.Data;

// @Data genera métodos como get, set, toString, equals y hashCode
@Data

// @Entity le dice a JPA que esta clase representa una tabla en la base de datos
@Entity

// @Table define el nombre de la tabla en MySQL
@Table(name = "perfil")
public class Perfil {

    // @Id indica que este atributo será la llave primaria
    @Id

    // @GeneratedValue indica que el id se generará automáticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // @Column define el nombre exacto de la columna en la tabla
    @Column(name = "id_perfil")
    private Integer idPerfil;

    // Este atributo guardará el nombre del perfil o rol
    // Ejemplo: ADMIN, USER, SECRETARIA, VENDEDOR
    private String nombre;
}