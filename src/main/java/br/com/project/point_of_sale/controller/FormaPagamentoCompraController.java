package br.com.project.point_of_sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.point_of_sale.repository.FormaPagamentoCompraRepository;

@RestController
@RequestMapping("/forma-pagamento-compra")
public class FormaPagamentoCompraController {
    @Autowired
    private FormaPagamentoCompraRepository formaPagamentoCompraRepository;
}
