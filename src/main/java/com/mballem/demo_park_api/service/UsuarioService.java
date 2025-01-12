package com.mballem.demo_park_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.demo_park_api.entity.Usuario;
import com.mballem.demo_park_api.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service

public class UsuarioService {
	
	@Autowired
	private final UsuarioRepository usuarioRepository;	

	@Transactional
	public Usuario salvar (Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Transactional(readOnly = true)
	public Usuario buscarPorId(Long id) {		
		return usuarioRepository.findById(id).orElseThrow(
				() -> new RuntimeException("Usuário não encontrado"));
	}

}
