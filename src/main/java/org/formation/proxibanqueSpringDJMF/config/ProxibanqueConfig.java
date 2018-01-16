package org.formation.proxibanqueSpringDJMF.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author DJMF
 * The Class ProxibanqueConfig.
 */
@Configuration
@EnableJpaRepositories(basePackages={"org.formation.proxibanqueSpringDJMF"})
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages= {"org.formation.proxibanqueSpringDJMF"})
public class ProxibanqueConfig {

	/** The environment. */
	@Autowired
	private Environment environment;
	
	/**
	 * Data source.
	 *
	 * @return the data source
	 */
	@Bean
	public DataSource dataSource() {		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("jdbc.driverClass"));
		dataSource.setUrl(environment.getProperty("jdbc.url"));
		dataSource.setUsername(environment.getProperty("jdbc.username"));
		dataSource.setPassword(environment.getProperty("jdbc.password"));		
		return dataSource;
	}

	/**
	 * Database populator.
	 *
	 * @return the database populator
	 */
//	private DatabasePopulator databasePopulator() {
//		
//		ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
//		databasePopulator.setContinueOnError(false);
//		databasePopulator.addScript(new ClassPathResource("test-data.sql"));
//		return databasePopulator;
//		
//	}

	
	/**
	 * Transaction manager.
	 *
	 * @param entityManagerFactory the entity manager factory
	 * @return the jpa transaction manager
	 */
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();		
		jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);	
			
		return jpaTransactionManager;
		
	}
	
	/**
	 * Jpa vendor adapter.
	 *
	 * @return the jpa vendor adapter
	 */
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		
		//JPA Java Persistence API (tHE Standard Specification for accessing databases through Java Objects)
		//Hibernate Implementation of JPA is used 
		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		
		//JPA vendor adapter will set SQL syntax to MYSQL
		jpaVendorAdapter.setDatabase(Database.MYSQL);
		
		//Database tables-setGenerateDdl(true);
		//setting this will show SQLS on logs
		jpaVendorAdapter.setShowSql(true);
		
		return jpaVendorAdapter;
	}
	
	
	/**
	 * Entity manager factory.
	 *
	 * @return the local container entity manager factory bean
	 */
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
			
		//Entity Manager Factory configuration is required in order to manage entities (tables) in Spring MVC
		//Entity Manager Factory will manage the life cycle of entities in Java 
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		
		//Entity manager factory requires a data source in order to store/list entities
		entityManagerFactory.setDataSource(dataSource());
		
		//Java Config Dependency injection is provided here by setting JPA Vendor Adapter (Hibernate)
		entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter());
		
		//Entity Manager Factory will scan packages in order to find entities (@Entity)
		entityManagerFactory.setPackagesToScan("org.formation.proxibanqueSpringDJMF.entity");
		
		//Custom properties can be set using Properties
		Properties jpaProperties = new Properties();
		jpaProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		entityManagerFactory.setJpaProperties(jpaProperties);
		
		return entityManagerFactory;
		
	}

	
}
