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
(generator = ObjectIdGenerators.PropertyGenerator.class, property= "idCaixa")

@Entity
@Table(name="caixa")
public class Caixa {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_caixa")
    private Integer idCaixa;

    @Column(name="nome")
    private String nome;

    @Column(name="saldo")
    private double saldo;

    public Integer getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(Integer idCaixa) {
        this.idCaixa = idCaixa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
}
