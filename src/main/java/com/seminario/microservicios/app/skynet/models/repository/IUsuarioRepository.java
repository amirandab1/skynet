package com.seminario.microservicios.app.skynet.models.repository;

import com.seminario.microservicios.app.skynet.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
}
