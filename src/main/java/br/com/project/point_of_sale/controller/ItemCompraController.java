package br.com.project.point_of_sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.point_of_sale.repository.ItemCompraRepository;

@RestController
@RequestMapping("/item-compra")
public class ItemCompraController {
    @Autowired
    private ItemCompraRepository itemCompraRepository;
}
