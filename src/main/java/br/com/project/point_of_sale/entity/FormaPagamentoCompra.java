package br.com.project.point_of_sale.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo
(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idFormaPagamentoCompra")

@Entity
@Table(name="forma_pagamento_compra")
public class FormaPagamentoCompra {
    @Column(name="id_forma_pagamento_compra")
    private Integer idFormaPagamentoCompra;

    @Column(name="valor")
    private double valor;

    public Integer getIdFormaPagamentoCompra() {
        return idFormaPagamentoCompra;
    }

    public void setIdFormaPagamentoCompra(Integer idFormaPagamentoCompra) {
        this.idFormaPagamentoCompra = idFormaPagamentoCompra;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
