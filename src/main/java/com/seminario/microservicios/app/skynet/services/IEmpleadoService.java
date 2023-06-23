package com.seminario.microservicios.app.skynet.services;

import com.seminario.microservicios.app.skynet.models.entity.Cliente;
import com.seminario.microservicios.app.skynet.models.entity.Empleado;

import java.util.Optional;

public interface IEmpleadoService {

    public Iterable<Empleado> findAll();

    public Optional<Empleado> findById(Long id);

    public Empleado save (Empleado empleado);

}
