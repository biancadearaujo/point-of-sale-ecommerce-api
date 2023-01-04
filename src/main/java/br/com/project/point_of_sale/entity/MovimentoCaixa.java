package br.com.project.point_of_sale.entity;

import java.time.LocalDate;

public class MovimentoCaixa {
    private Integer idMovimentoCaixa;
    private Integer numeroMovimento;
    private LocalDate dataMovimento;
    private String descricao;
    private String tipoMovimento;
    private double valor;
}
