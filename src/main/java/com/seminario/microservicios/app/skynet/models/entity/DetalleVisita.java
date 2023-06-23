package com.seminario.microservicios.app.skynet.models.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "detalle_visitas")
public class DetalleVisita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "latitud_origen", length = 16)
    private String latitudOrigen;

    @Column(name = "longitud_origen", length = 16)
    private String longitudOrigen;

    @Column(name = "latitud_destino", length = 16)
    private String latitudDestino;

    @Column(name = "longitud_destino", length = 16)
    private String longitudDestino;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonManagedReference(value = "detalle_movimiento")
    @JoinColumn(name = "visita_id")
    private Visita visita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonManagedReference(value = "estado_movimiento")
    @JoinColumn(name = "estado_id")
    private Estado estado;


}
