package projeto.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableBatchProcessing
@SpringBootApplication
@EnableTransactionManagement
public class ProjectBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBatchApplication.class, args);
	}
	

}
