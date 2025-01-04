package com.mballem.demo_park_api.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.demo_park_api.entity.Usuario;
import com.mballem.demo_park_api.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository = null;
	
	@Transactional
	public Usuario salvar (Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
