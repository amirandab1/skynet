package com.seminario.microservicios.app.skynet.services.impl;

import com.seminario.microservicios.app.skynet.models.entity.Cliente;
import com.seminario.microservicios.app.skynet.models.repository.IClienteRepository;
import com.seminario.microservicios.app.skynet.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    IClienteRepository clienteRepository;

    @Override
    public Iterable<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
