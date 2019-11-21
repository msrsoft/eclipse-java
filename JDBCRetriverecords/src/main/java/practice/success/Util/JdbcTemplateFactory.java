package practice.success.Util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JdbcTemplateFactory {
	@Autowired
	public DataSource dataSource;
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTempalte = new JdbcTemplate();
		jdbcTempalte.setDataSource(dataSource);
		return jdbcTempalte;
	}

}
