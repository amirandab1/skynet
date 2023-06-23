package com.seminario.microservicios.app.skynet.models.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", length = 64)
    private String username;

    @Column(name = "password", length = 256)
    private String password;

    @Column(name = "habilitado")
    private Boolean habilitado = true;

    //@JsonBackReference(value = "usuario_movimiento")
    //@JsonIgnore
    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "empleado_id")
    //private Empleado empleado;


}
