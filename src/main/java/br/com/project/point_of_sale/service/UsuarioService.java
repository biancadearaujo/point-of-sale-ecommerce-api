package br.com.project.point_of_sale.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.project.point_of_sale.dto.UsuarioDto;
import br.com.project.point_of_sale.dto.UsuarioInserirDto;
import br.com.project.point_of_sale.entity.Usuario;
import br.com.project.point_of_sale.repository.UsuarioRepository;
import br.com.project.point_of_sale.validador.UsuarioValidador;
import br.com.project.point_of_sale.validador.ValidationException;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    private UsuarioValidador usuarioValidador;

    public UsuarioService(){
        this.usuarioValidador = new UsuarioValidador(this);
    }


    public List<UsuarioDto> getAllUsuarios(){

        List<Usuario> usuarios = usuarioRepository.findAll();
        List<UsuarioDto> usuariosDto = new ArrayList<UsuarioDto>();

        for(Usuario usuario : usuarios){
            usuariosDto.add(new UsuarioDto(usuario));
        }
        return usuariosDto;
    }


    public UsuarioDto getUsuarioById(Integer id){
        
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id); 
        
        try{
            var validador = usuarioValidador.validarUsuario(usuarioOptional);
            if(!validador){
                throw new ValidationException("Usuário não encontrado");
            }
        }catch (ValidationException validador){
            System.out.println(validador.getMessage());
            return null;
        }
        
        return new UsuarioDto(usuarioOptional.get());
    }


    public UsuarioDto saveUsuario(UsuarioInserirDto usuarioInserirDto){

        Usuario usuario = new Usuario();

        usuario.setNome(usuarioInserirDto.getNome());
        usuario.setCpfCnpj(usuarioInserirDto.getCpfCnpj());
        usuario.setTelefone(usuarioInserirDto.getTelefone());
        usuario.setEmail(usuarioInserirDto.getEmail());
        //usuario.setSenha(usuarioInserirDto.getSenha());

        return new UsuarioDto(usuarioRepository.save(usuario));
    }


    public UsuarioDto updateUsuario(UsuarioInserirDto usuarioInserirDto, Integer id){
       
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        try{
            var validador = usuarioValidador.validarUsuario(usuarioOptional);
            if(!validador){
                throw new ValidationException("Usuário não encontrado");
            }
        
        }catch (ValidationException validador){
            System.out.println(validador.getMessage());
            
            return null;

        }
         
        //usuarioOptional.get().setIdUsuario(usuario.getIdUsuario());
        usuarioOptional.get().setCpfCnpj(usuarioInserirDto.getCpfCnpj());
        usuarioOptional.get().setEmail(usuarioInserirDto.getEmail());
        //usuarioOptional.get().setEndereco(usuario.getEndereco());
        usuarioOptional.get().setNome(usuarioInserirDto.getNome());
        usuarioOptional.get().setTelefone(usuarioInserirDto.getTelefone());
        //usuarioOptional.get().setSenha(usuarioInserirDto.getSenha());

        return new UsuarioDto(usuarioRepository.save(usuarioOptional.get()));

    }


    public  Object deleteUsuario(Integer id){
           
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        try{
            var validador = usuarioValidador.validarUsuario(usuarioOptional);
            if(!validador){
                throw new ValidationException("Usuário não encontrado");
            }
        }catch(ValidationException validador){
            System.out.println(validador.getMessage());
            return null;
        }

        usuarioRepository.deleteById(id);

        return "deletado";  

    }

}
