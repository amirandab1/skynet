package com.seminario.microservicios.app.skynet.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 32)
    private String nombre;

    @Column(name = "descripcion", length = 128)
    private String descripcion;

}
