package br.com.project.point_of_sale.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo
(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idVenda")

@Entity
@Table(name="venda")
public class Venda {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idVenda")
    private Integer idVenda;

    @Column(name="data")
    private LocalDate data;

    //id cliente 
    
    @Column(name="totalVenda")
    private double totalVenda;

    @Column(name="situacaoVenda")
    private String situacaoVenda;

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public String getSituacaoVenda() {
        return situacaoVenda;
    }

    public void setSituacaoVenda(String situacaoVenda) {
        this.situacaoVenda = situacaoVenda;
    }
  
}
