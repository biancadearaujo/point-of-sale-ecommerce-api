package br.com.project.point_of_sale.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo
(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idFormaPagamentoVenda")

@Entity
@Table(name="forma_pagamento_venda")
public class FormaPagamentoVenda {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_forma_pagamento_venda")
    private Integer idFormaPagamentoVenda;
    //idFormaPagamentoVenda

    @Column(name="valor")
    private double valor;

    public Integer getIdFormaPagamentoVenda() {
        return idFormaPagamentoVenda;
    }

    public void setIdFormaPagamentoVenda(Integer idFormaPagamentoVenda) {
        this.idFormaPagamentoVenda = idFormaPagamentoVenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
 
}
