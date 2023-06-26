package com.seminario.microservicios.app.skynet.services;

import com.seminario.microservicios.app.skynet.models.entity.Estado;

import java.util.Optional;

public interface IEstadoService {

    public Iterable<Estado> findAll();

    public Optional<Estado> findById(Long id);

    public Estado save(Estado estado);

}
