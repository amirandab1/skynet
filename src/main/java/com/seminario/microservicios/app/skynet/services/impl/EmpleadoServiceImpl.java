package com.seminario.microservicios.app.skynet.services.impl;

import com.seminario.microservicios.app.skynet.models.entity.Empleado;
import com.seminario.microservicios.app.skynet.models.repository.IEmpleadoRepository;
import com.seminario.microservicios.app.skynet.services.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired
    IEmpleadoRepository empleadoRepository;

    @Override
    public Iterable<Empleado> findAll() { return empleadoRepository.findAll(); }

    @Override
    public Optional<Empleado> findById(Long id) { return empleadoRepository.findById(id); }

    @Override
    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }


}
