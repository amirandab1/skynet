package com.seminario.microservicios.app.skynet.models.repository;

import com.seminario.microservicios.app.skynet.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IClienteRepository extends JpaRepository<Cliente, Long>{

}
