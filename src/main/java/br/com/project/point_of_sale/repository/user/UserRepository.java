package br.com.project.point_of_sale.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import br.com.project.point_of_sale.model.user.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{
    
    UserDetails findByLogin(String login);
    
}
