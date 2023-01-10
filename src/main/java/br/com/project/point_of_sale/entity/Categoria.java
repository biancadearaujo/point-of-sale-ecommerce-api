package br.com.project.point_of_sale.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo 
(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idCategoria")

@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Integer idCategoria;

    @Column(name="nome")
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private List<Produto>produto;

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

}
