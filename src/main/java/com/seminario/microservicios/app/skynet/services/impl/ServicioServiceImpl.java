package com.seminario.microservicios.app.skynet.services.impl;

import com.seminario.microservicios.app.skynet.models.entity.Servicio;
import com.seminario.microservicios.app.skynet.models.repository.IServicioRepository;
import com.seminario.microservicios.app.skynet.services.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicioServiceImpl implements IServicioService {

    @Autowired
    IServicioRepository servicioRepository;

    @Override
    public Iterable<Servicio> findAll() { return servicioRepository.findAll(); }

    @Override
    public Optional<Servicio> findById(Long id) { return servicioRepository.findById(id); }

    @Override
    public Servicio save(Servicio servicio) { return servicioRepository.save(servicio); }
}
