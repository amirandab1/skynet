package com.seminario.microservicios.app.skynet.models.repository;

import com.seminario.microservicios.app.skynet.models.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {
}
