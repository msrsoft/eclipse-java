package pratice.success.util;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "pratice/success/config/db.propertice")
public class DataSourceUtil {
	@Autowired
	private Environment environment;
	
	
	@Bean
	public DataSource dataSource() {

		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(environment.getProperty("db.driverClassName"));

		dataSource.setUrl(environment.getProperty("db.Url"));
		dataSource.setUsername(environment.getProperty("db.Username"));
		dataSource.setPassword(environment.getProperty("db.Password"));
		return dataSource;
	}

}
