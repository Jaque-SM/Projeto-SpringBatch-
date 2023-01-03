package projeto.batch.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import projeto.batch.model.Customer;

public class CustomerMapper implements FieldSetMapper<Customer>{

	@Override
	public Customer mapFieldSet(FieldSet fieldSet) throws BindException {
			Customer mapper=new Customer();
			
			mapper.setName(fieldSet.readRawString(0));
			mapper.setCpf(fieldSet.readString(1));
		
		
		return mapper;
	}
	
	
	

}
