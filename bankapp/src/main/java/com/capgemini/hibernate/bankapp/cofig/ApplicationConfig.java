package com.capgemini.hibernate.bankapp.cofig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableTransactionManagement
public class ApplicationConfig {
	
	
	@Bean
	 public DataSource dataSource() {
	 try {
		 EmbeddedDatabaseBuilder dbBuilder = new EmbeddedDatabaseBuilder();
				 return dbBuilder.setType(EmbeddedDatabaseType.H2).addScripts("classpath:sql/schema.sql","classpath:sql/test-data.sql").build();
				 
	 }
	 catch (Exception e) {
		// TODO: handle exception
	}
	return null;
	}

}
