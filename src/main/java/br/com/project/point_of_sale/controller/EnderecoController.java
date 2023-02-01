package br.com.project.point_of_sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.point_of_sale.entity.Endereco;
import br.com.project.point_of_sale.repository.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco saveEndereco(@RequestBody Endereco endereco){
        return enderecoRepository.save(endereco);
    }
}
