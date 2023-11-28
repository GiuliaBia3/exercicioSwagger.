package com.giuliab.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giuliab.lombok.projetoLombok.entities.Usuario;

	public interface UsuarioRepositorio extends JpaRepository<Usuario , Long> {
		
		
	}
		
