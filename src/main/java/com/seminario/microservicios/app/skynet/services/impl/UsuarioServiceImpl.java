package com.seminario.microservicios.app.skynet.services.impl;

import com.seminario.microservicios.app.skynet.models.entity.Usuario;
import com.seminario.microservicios.app.skynet.models.repository.IUsuarioRepository;
import com.seminario.microservicios.app.skynet.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    IUsuarioRepository usuarioRepository;

    @Override
    public Iterable<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
