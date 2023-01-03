package projeto.batch.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto.batch.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	

}
