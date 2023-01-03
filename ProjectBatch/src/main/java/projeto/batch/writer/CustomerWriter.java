package projeto.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import projeto.batch.model.Customer;
import projeto.batch.repository.CustomerRepository;

@Component
public class CustomerWriter implements ItemWriter<Customer> {

	@Autowired
	private CustomerRepository repository;
	
	
	@Override
	public void write(List<? extends Customer> items) throws Exception {

		repository.saveAll(items);
		
		final var customers=repository.findAll();
	
		List<Customer> ouat=repository.findAll();
		
		
		System.out.println("**********************************");
		
			System.out.println(ouat.);
			System.out.println(((Customer) items).getCpf());
			System.out.println(((Customer) items).getDate());
		
		
		
	}
	
	
	
}
