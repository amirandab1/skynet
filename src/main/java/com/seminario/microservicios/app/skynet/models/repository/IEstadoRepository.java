package com.seminario.microservicios.app.skynet.models.repository;

import com.seminario.microservicios.app.skynet.models.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoRepository extends JpaRepository<Estado, Long> {
}
