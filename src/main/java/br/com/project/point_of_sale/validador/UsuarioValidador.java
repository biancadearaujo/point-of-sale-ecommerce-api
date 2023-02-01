package br.com.project.point_of_sale.validador;

import java.util.Optional;

import org.springframework.data.domain.Page;

import br.com.project.point_of_sale.entity.Usuario;
import br.com.project.point_of_sale.service.UsuarioService;

public class UsuarioValidador {
    
    private UsuarioService usuarioService;

    public UsuarioValidador(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

    public boolean validarUsuario(Optional<Usuario> usuarioOptional) {
		if(usuarioOptional.isEmpty()) {
			return false;
		}
		return true;
	}

    public boolean validaPaginacaoUsuario(Page usuarioPage) {
		if(usuarioPage.isEmpty()) {
			return false;
		}
		return true;
	}

}
