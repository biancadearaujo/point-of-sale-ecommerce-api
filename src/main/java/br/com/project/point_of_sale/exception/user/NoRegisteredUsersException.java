package br.com.project.point_of_sale.exception.user;

public class NoRegisteredUsersException extends RuntimeException{

	public NoRegisteredUsersException(String message) {
        super(message);
    }
    
}
