package com.seminario.microservicios.app.skynet.models.repository;

import com.seminario.microservicios.app.skynet.models.entity.Visita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IVisitaRepository extends JpaRepository<Visita, Long> {

    @Query(value = "select v from Visita v join fetch v.empleado e where e.id=?1 ")
    public Iterable<Visita> findEmpleadoByVisita(Long empleadoId);


}
