package br.com.project.point_of_sale.validador;

public class ValidationException extends Exception {
    
    public ValidationException(String mensagem) {
        super(mensagem);
    }
}
