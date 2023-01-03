package projeto.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import projeto.batch.model.Customer;
import projeto.batch.process.CustomerProcess;
import projeto.batch.reader.CustomerReader;
import projeto.batch.writer.CustomerWriter;

@Configuration
public class BatchConfig {
	
	@Autowired
	private JobBuilderFactory jobBuilder;
	
	@Autowired
	private StepBuilderFactory step;
	
	
	@Bean
	public Job customerJob(final Step  customerStep) {
		
		return jobBuilder.get("customerJob").start(customerStep).build();
	}
	
	  @Bean
	  public Step customerStep(CustomerReader customerReader,
			  CustomerProcess customerProcessor,
			  CustomerWriter customerWriter) {
	    return step.get("customerStep")
	        .<Customer, Customer>chunk(1)
	        .reader(customerReader)
	        .processor(customerProcessor)
	        .writer(customerWriter)
	        .build();
	  }
	 
	  
	
	
	

}
