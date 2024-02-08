package br.com.project.point_of_sale.exception.user;

public class UserAlreadyExistsException extends RuntimeException{

	public UserAlreadyExistsException(String message) {
        super(message);
    }
    
}
