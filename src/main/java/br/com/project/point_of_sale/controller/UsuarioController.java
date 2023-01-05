package br.com.project.point_of_sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.point_of_sale.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
}
