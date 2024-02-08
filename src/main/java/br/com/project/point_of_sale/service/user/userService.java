package br.com.project.point_of_sale.service.user;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.project.point_of_sale.build.user.UserBuilder;
import br.com.project.point_of_sale.command.user.CreateUserCommand;
import br.com.project.point_of_sale.exception.user.NoRegisteredUsersException;
import br.com.project.point_of_sale.exception.user.UserAlreadyExistsException;
import br.com.project.point_of_sale.model.user.UserModel;
import br.com.project.point_of_sale.repository.user.UserRepository;

@Service
public class userService {
    
    @Autowired
	private UserRepository userRepository;
    
    public List<UserModel> read() {
    	if(this.userRepository.findAll().isEmpty()) {
    		throw new NoRegisteredUsersException("No registered users");
    	}
    	return userRepository.findAll();
    	
    }

	public UserModel register(CreateUserCommand createUserCommand){
		
		if(createUserCommand.getPassword() == null) {
			throw new IllegalArgumentException("Password cannot be null");
		}
		System.out.println(createUserCommand.getPassword());
		if(createUserCommand.getLogin() == null) {
			throw new IllegalArgumentException("Login cannot be null");
		}
        if(this.userRepository.findByLogin(createUserCommand.getLogin()) != null) {
        	throw new UserAlreadyExistsException("Existing user with this login");
        }
        
        LocalDateTime now = LocalDateTime.now();

        String encryptedPassword = new BCryptPasswordEncoder().encode(createUserCommand.getPassword());
        
        UserModel newUser = new UserBuilder()
        		.name(createUserCommand.getName())
        		.email(createUserCommand.getEmail())
        		.login(createUserCommand.getLogin())
        		.password(encryptedPassword)
        		.role(createUserCommand.getRole())
        		.createdAt(now)
        		.updatedAt(now)
        		.phoneNumber(createUserCommand.getPhoneNumber())
        		.avatarUrl(createUserCommand.getAvatarUrl())
        		.isActive(true)
        		.verificationToken(createUserCommand.getVerificationToken())
        		.build();
        
        return userRepository.save(newUser);
        
	}

}
