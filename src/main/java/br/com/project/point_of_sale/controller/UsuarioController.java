package br.com.project.point_of_sale.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.point_of_sale.dto.UsuarioDto;
import br.com.project.point_of_sale.dto.UsuarioInserirDto;
import br.com.project.point_of_sale.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> getAllUsuarios(){

        return ResponseEntity.status(HttpStatus.FOUND).body(usuarioService.getAllUsuarios());
    
    }  


    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDto>getUsuarioById(@PathVariable Integer id){

        if(usuarioService.getUsuarioById(id)!= null){
            return ResponseEntity.status(HttpStatus.FOUND).body(usuarioService.getUsuarioById(id));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        
    }

    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UsuarioDto> saveUsuario(@Valid @RequestBody UsuarioInserirDto usuarioInserirDto){
       
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.saveUsuario(usuarioInserirDto));

    }


    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDto>updateUsuario(@Valid @PathVariable Integer id,
    @RequestBody UsuarioInserirDto usuarioInserirDto){
        
        if(usuarioService.updateUsuario(usuarioInserirDto, id) != null){
            return ResponseEntity.status(HttpStatus.OK).body(usuarioService.updateUsuario(usuarioInserirDto, id));
        }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object>deleteUsuario(@PathVariable Integer id){
        if(usuarioService.deleteUsuario(id) != null){
            
            return ResponseEntity.status(HttpStatus.OK).body(usuarioService.deleteUsuario(id));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }
    
}
