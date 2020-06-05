package com.crud.usuarios.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "auditoria")
@Data
public class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "id_usuario", nullable = false)
    @OneToMany
    private Usuario idusuario;

    @Column (name ="proceso", nullable = false)
    private String proceso;

    @Column (name ="fecha_registro", nullable = false)
    private Date fechaRegistro;

}
