package com.seminario.microservicios.app.skynet.services;

import com.seminario.microservicios.app.skynet.models.entity.Cliente;

import java.util.Optional;

public interface IClienteService {

    public Iterable<Cliente> findAll();

    public Optional<Cliente> findById(Long id);

    public Cliente save(Cliente cliente);

}
