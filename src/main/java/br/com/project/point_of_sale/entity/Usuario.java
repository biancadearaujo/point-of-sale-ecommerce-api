package br.com.project.point_of_sale.entity;

import java.util.List;


//@JsonIdentityInfo
//(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idUsuario")

//@Entity
//@Table(name="usuario")
public class Usuario {
  /*  @Id
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

   }
