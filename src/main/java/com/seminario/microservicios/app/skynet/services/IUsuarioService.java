package com.seminario.microservicios.app.skynet.services;

import com.seminario.microservicios.app.skynet.models.entity.Servicio;
import com.seminario.microservicios.app.skynet.models.entity.Usuario;

import java.util.Optional;

public interface IUsuarioService {

    public Iterable<Usuario> findAll();

    public Optional<Usuario> findById(Long id);

    public Usuario save(Usuario usuario);

}
