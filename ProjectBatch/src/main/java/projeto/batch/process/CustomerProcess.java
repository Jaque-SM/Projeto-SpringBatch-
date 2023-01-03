package projeto.batch.process;

import java.time.LocalDateTime;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import projeto.batch.model.Customer;

@Component
public class CustomerProcess implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer item) throws Exception {
		final var creationDate=LocalDateTime.now();
		
		item.setDate(creationDate);
		
		
		return item;
	}
	
	

}
