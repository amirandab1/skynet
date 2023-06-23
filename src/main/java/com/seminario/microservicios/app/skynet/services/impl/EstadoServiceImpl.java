package com.seminario.microservicios.app.skynet.services.impl;

import com.seminario.microservicios.app.skynet.models.entity.Empleado;
import com.seminario.microservicios.app.skynet.models.entity.Estado;
import com.seminario.microservicios.app.skynet.models.repository.IEmpleadoRepository;
import com.seminario.microservicios.app.skynet.models.repository.IEstadoRepository;
import com.seminario.microservicios.app.skynet.services.IEstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstadoServiceImpl implements IEstadoService {

    @Autowired
    IEstadoRepository estadoRepository;

    @Override
    public Iterable<Estado> findAll() { return estadoRepository.findAll(); }

    @Override
    public Optional<Estado> findById(Long id) { return estadoRepository.findById(id); }

    @Override
    public Estado save(Estado estado) { return estadoRepository.save(estado); }
}
