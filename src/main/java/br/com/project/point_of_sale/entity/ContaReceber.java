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
(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idContaReceber")

@Entity
@Table(name="conta_receber")
public class ContaReceber {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_conta_receber")
    private Integer idContaReceber;

    @Column(name="descricao")
    private String descricao;
    //idCliente

    @Column(name="data_lancamento")
    private LocalDate dataLancamento;

    @Column(name="data_vencimento")
    private LocalDate dataVencimento;

    @Column(name="valor")
    private double valor;

    @Column(name="recibo")
    private double recebido;

    @Column(name="data_recebimento")
    private LocalDate dataRecebimento;

    @Column(name="valor_recebimento")
    private double valorRecebimento;

    public Integer getIdContaReceber() {
        return idContaReceber;
    }

    public void setIdContaReceber(Integer idContaReceber) {
        this.idContaReceber = idContaReceber;
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

    public double getRecebido() {
        return recebido;
    }

    public void setRecebido(double recebido) {
        this.recebido = recebido;
    }

    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(LocalDate dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public double getValorRecebimento() {
        return valorRecebimento;
    }

    public void setValorRecebimento(double valorRecebimento) {
        this.valorRecebimento = valorRecebimento;
    }

}
