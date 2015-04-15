package com.test;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

@EnableTransactionManagement
@Configuration
@ComponentScan
public class AppConfiguration {

	@Bean
	public PlatformTransactionManager transactionManager() {
		JtaTransactionManager txManager = new JtaTransactionManager();
		return txManager;
	}
	
//	@Bean PersistenceAnnotationBeanPostProcessor getPersistenceAnnotationBeanPostProcessor(){
//		PersistenceAnnotationBeanPostProcessor p = new PersistenceAnnotationBeanPostProcessor() ;
//		p.setDefaultPersistenceUnitName("jndi.test");
//		return p ;
//	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//		emf.setDataSource(dataSource());
//		emf.setPackagesToScan(new String[] { "com.cht.test" });
//		emf.setPersistenceProvider(new HibernatePersistence());
//		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//		emf.setJpaVendorAdapter(vendorAdapter);
//		emf.setJpaProperties(additionalProperties());
		emf.setPersistenceXmlLocation("/META-INF/persistence.xml");
		return emf ;
	}
	
	
//	private DataSource dataSource(){
//		Context c;
//		try {
//			c = new InitialContext();
//			String jndi = "java:/jndi.test" ;
//			return (DataSource) c.lookup(jndi) ;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null ;
//		}
//
//	}
//
//	private Properties additionalProperties() {
//		Properties properties = new Properties();
//		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLInnoDBDialect");
//		properties.setProperty("hibernate.cache.use_second_level_cache", "false");
//		return properties;
//	}

	
}
