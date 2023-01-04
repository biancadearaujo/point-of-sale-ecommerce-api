package br.com.project.point_of_sale.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo
(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idContaPagar")

@Entity
@Table(name="conta_pagar")
public class ContaPagar {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_conta_pagar")
    private Integer idContaPagar;

    @Column(name="descricao")
    private String descricao;
    //idFornecedor

    @Column(name="data_lancamento")
    private LocalDate dataLancamento;

    @Column(name="data_vencimento")
    private LocalDate dataVencimento;

    @Column(name="valor")
    private double valor;

    @Column(name="pago")
    private double pago;

    @Column(name="data_pagamento")
    private LocalDate dataPagamento;

    @Column(name="valor_pagamento")
    private double valorPagamento;

    public Integer getIdContaPagar() {
        return idContaPagar;
    }

    public void setIdContaPagar(Integer idContaPagar) {
        this.idContaPagar = idContaPagar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }
   
}
