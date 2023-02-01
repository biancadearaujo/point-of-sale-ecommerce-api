package br.com.project.point_of_sale.dto;

import java.util.Optional;

import br.com.project.point_of_sale.entity.Usuario;

public class UsuarioDto {
    private Integer idUsuario;
    private String nome;
    private String cpfCnpj;
    private String telefone;
    private String email;
    public UsuarioDto(){

    }
    
    public UsuarioDto(Integer idUsuario, String nome, String cpfCnpj, String telefone, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.telefone = telefone;
        this.email = email;
    }

    public UsuarioDto(Usuario usuario){
        this.idUsuario = usuario.getIdUsuario();
        this.nome = usuario.getNome();
        this.cpfCnpj = usuario.getCpfCnpj();
        this.telefone = usuario.getTelefone();
        this.email = usuario.getEmail();
    }

    /*public UsuarioDto(Optional<Usuario> usuarioOptional){

    }*/

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
   
}
