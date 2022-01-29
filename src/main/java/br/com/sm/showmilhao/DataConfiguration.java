package br.com.sm.showmilhao;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {

	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/show_milhao");
		ds.setUsername("root");
		ds.setPassword("L1deranc@");
		
		return ds;
		
	}
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
	
		HibernateJpaVendorAdapter ad = new HibernateJpaVendorAdapter();
		ad.setDatabase(Database.MYSQL);
		ad.setShowSql(true);
		ad.setGenerateDdl(true);
		ad.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
		ad.setPrepareConnection(true);
		
		return ad;
	}
	
	
}
