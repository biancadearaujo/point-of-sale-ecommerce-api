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
(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idItemVenda")

@Entity
@Table(name="item_venda")
public class ItemVenda {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_item_venda")
    private Integer idItemVenda;

    @Column(name="numero_item")
    private Integer numeroItem;
    //idProduto

    @Column(name="quantidade")
    private Integer quantidade;

    @Column(name="valor_unitario")
    private double valorUnitario;

    @Column(name="total_item")
    private double totalItem;

    public Integer getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(Integer idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public Integer getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(double totalItem) {
        this.totalItem = totalItem;
    }
  
}

