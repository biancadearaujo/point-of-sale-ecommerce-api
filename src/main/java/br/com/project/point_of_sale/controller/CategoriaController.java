package br.com.project.point_of_sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.point_of_sale.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;
}
