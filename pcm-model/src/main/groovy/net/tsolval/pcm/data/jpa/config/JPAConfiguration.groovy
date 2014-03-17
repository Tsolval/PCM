package net.tsolval.pcm.data.jpa.config

import javax.persistence.EntityManagerFactory
import javax.sql.DataSource

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * Spring configuration class for JPA environment.  This class sets up an embedded H2 database for use in testing.  <br/> 
 * TODO: Add profile to the database configuration to make the embedded database 
 * available during testing only.
 * @author tsolval
 *
 */
@Configuration
@EnableJpaRepositories
@EnableTransactionManagement
class JPAConfiguration {
	@Bean public DataSource dataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder()
		builder.setType(EmbeddedDatabaseType.H2)
	}

	@Bean
	public EntityManagerFactory entityManagerFactory() {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter()
		vendorAdapter.setGenerateDdl(true)

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean()
		factory.setJpaVendorAdapter(vendorAdapter)
		factory.setPackagesToScan("net.tsolval.pcm.data")
		factory.setDataSource(dataSource())
		factory.afterPropertiesSet()

		factory.getObject()
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager txManager = new JpaTransactionManager()
		txManager.setEntityManagerFactory(entityManagerFactory())
		txManager
	}
}