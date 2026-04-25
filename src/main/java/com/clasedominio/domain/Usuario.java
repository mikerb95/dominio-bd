package com.clasedominio.domain;

// Importo las anotaciones de JPA para mapear esta clase a una tabla de MySQL
import jakarta.persistence.*;

// Importo Lombok para generar automáticamente getters, setters, toString, etc.
import lombok.Data;

// @Data genera métodos como get, set, toString, equals y hashCode
@Data

// @Entity le dice a JPA que esta clase representa una tabla en la base de datos
@Entity

// @Table define el nombre de la tabla en MySQL
@Table(name = "usuario")
public class Usuario {

    // @Id indica que este atributo será la llave primaria
    @Id

    // @GeneratedValue indica que el id se generará automáticamente en la base
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // @Column define el nombre exacto de la columna en la tabla
    @Column(name = "id_usuario")
    private Integer idUsuario;

    // Nombre de usuario con el que la persona iniciará sesión
    private String username;

    // Contraseña del usuario
    private String password;

    // Estado del usuario: normalmente 1 = activo, 0 = inactivo
    private Integer activo;

    // @ManyToOne indica que muchos usuarios pueden pertenecer a un mismo perfil
    @ManyToOne

    // @JoinColumn define la columna que relaciona usuario con perfil
    @JoinColumn(name = "id_perfil")
    private Perfil perfil;
}