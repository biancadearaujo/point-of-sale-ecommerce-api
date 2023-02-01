package br.com.project.point_of_sale.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo
(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idProduto")

@Entity
@Table(name="produto")
public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_produto")
    private Integer idProduto;

    @Column(name="nome")
    private String nome;

    @Column(name="quantidadeEstoque")
    private Integer quantidadeEstoque;

    @Column(name="preco")
    private Double preco;

    @Column(name="unidade")
    private String unidade;

    public Integer getIdProduto() {
        return idProduto;
    }

    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;

   /* @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;*/

    //id fornecedor
    //idCategoria

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /*public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }*/

}
