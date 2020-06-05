package com.crud.usuarios.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "usuario", nullable = false, unique = true, length = 20)
    private String usuario;

    @Column(name = "password", nullable = false, length = 30)
    private String password;

    @Column(name = "activo", nullable = false)
    private boolean activo = true;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;

    @Column(name = "correo", nullable = false, unique = true)
    private String correo;

}
