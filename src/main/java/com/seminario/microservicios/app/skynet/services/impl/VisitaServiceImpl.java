package com.seminario.microservicios.app.skynet.services.impl;

import com.seminario.microservicios.app.skynet.models.entity.Visita;
import com.seminario.microservicios.app.skynet.models.repository.IVisitaRepository;
import com.seminario.microservicios.app.skynet.services.IVisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VisitaServiceImpl implements IVisitaService {

    @Autowired
    private IVisitaRepository visitaRepository;

    @Override
    @Transactional
    public Iterable<Visita> saveAll(Iterable<Visita> visitas) {
        return visitaRepository.saveAll(visitas);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Visita> findEmpleadoByVisita(Long empleadoId) {
        return visitaRepository.findEmpleadoByVisita(empleadoId);
    }

    @Override
    public Iterable<Visita> findAll() {
        return visitaRepository.findAll();
    }
}
