package br.com.project.point_of_sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.project.point_of_sale.entity.ContaReceber;

@Repository
public interface ContaReceberRepository extends JpaRepository<ContaReceber, Integer>{
    
}
