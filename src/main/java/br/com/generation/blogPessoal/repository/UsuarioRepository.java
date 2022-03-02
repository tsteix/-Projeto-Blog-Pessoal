package br.com.generation.blogPessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.generation.blogPessoal.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
		
		public Optional<Usuario> findByUsuario (String usuario);		
}
