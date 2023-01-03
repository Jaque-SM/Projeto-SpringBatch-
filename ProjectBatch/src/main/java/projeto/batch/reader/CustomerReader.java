package projeto.batch.reader;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.PathResource;
import org.springframework.stereotype.Component;

import projeto.batch.mapper.CustomerMapper;
import projeto.batch.model.Customer;

@Component
public class CustomerReader extends FlatFileItemReader<Customer> {
	
	public CustomerReader() {
		
		DefaultLineMapper<Customer> line= new DefaultLineMapper<>();
		
		line.setLineTokenizer(new DelimitedLineTokenizer());
		line.setFieldSetMapper(new CustomerMapper());
		this.setLineMapper(line);
		this.setResource(new PathResource("C:\\Users\\Vericoders\\Desktop\\MiniCurso Spring Batch\\Arquivo.csv"));
		//this.setResource(new PathResource("../Arquivo.csv"));
	}

}
