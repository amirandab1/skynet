package com.seminario.microservicios.app.skynet.services;

import com.seminario.microservicios.app.skynet.models.entity.Cliente;
import com.seminario.microservicios.app.skynet.models.entity.Visita;

public interface IVisitaService {

    public Iterable<Visita> saveAll(Iterable<Visita> visitas);

    public Iterable<Visita> findEmpleadoByVisita(Long empleadoId);

    public Iterable<Visita> findAll();

}
