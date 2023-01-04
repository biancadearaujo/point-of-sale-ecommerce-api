package br.com.project.point_of_sale.entity;

import java.time.LocalDate;

public class ContaReceber {
    private Integer idContaReceber;
    private String descricao;
    //idCliente
    private LocalDate dataLancamento;
    private LocalDate dataVencimento;
    private double valor;
    private double recebido;
    private LocalDate dataRecebimento;
    private LocalDate valorRecebimento;
}
