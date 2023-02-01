package br.com.project.point_of_sale.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class UsuarioControllerExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(UsuarioException.class)
    protected ResponseEntity<Object> handleUsuarioUsuarioException(UsuarioException ex){
        return ResponseEntity.unprocessableEntity().body(ex.getMessage());
    }
}
