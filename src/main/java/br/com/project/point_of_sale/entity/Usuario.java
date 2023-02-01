package br.com.project.point_of_sale.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo
(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idUsuario")

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer idUsuario;
    
    @NotBlank(message = "Preencha a descrição")
    @Size(max = 40, message = "Tamanho máximo 40")
    @Column(name="nome", nullable = false, length = 40)
    private String nome;

    @Column(name="cpf_cnpj")
    private String cpfCnpj;

    @Column(name="telefone")
    private String telefone;

    @Column(name="email")
    private String email;

    /*@Column(name="senha")
    private String senha;*/

/*    @OneToMany(mappedBy = "usuario")
    private List<Endereco>endereco;
*/
    /*@OneToMany(mappedBy = "usuario")
    private List<Produto>produto;*/

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }*/

/*
    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }*/

    /*public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }*/

}
