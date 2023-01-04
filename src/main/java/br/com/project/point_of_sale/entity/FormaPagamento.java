package br.com.project.point_of_sale.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo
(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_forma_pagamento")

@Entity
@Table(name="forma_pagamento")
public class FormaPagamento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_forma_pagamento")
    private Integer idFormaPagamento;

    @Column(name="nome")
    private String nome;

    public Integer getIdFormaPagamento() {
        return idFormaPagamento;
    }

    public void setIdFormaPagamento(Integer idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
