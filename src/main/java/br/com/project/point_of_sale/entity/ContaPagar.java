package br.com.project.point_of_sale.entity;

import java.time.LocalDate;

public class ContaPagar {
    private Integer idContaPagar;
    private String descricao;
    //idFornecedor
    private LocalDate dataLancamento;
    private LocalDate dataVencimento;
    private double valor;
    private double pago;
    private LocalDate dataPagamento;
    private LocalDate valorPagamento;
    
}
