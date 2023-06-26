package com.seminario.microservicios.app.skynet.services;

import com.seminario.microservicios.app.skynet.models.entity.Servicio;

import java.util.Optional;

public interface IServicioService {

    public Iterable<Servicio> findAll();

    public Optional<Servicio> findById(Long id);

    public Servicio save(Servicio servicio);
}
