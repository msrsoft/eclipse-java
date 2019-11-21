package pratice.success.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import pratice.success.util.Employee;

@Repository
public class EmployeeDao {

	SimpleJdbcInsert simpleJdbcInsert;

	@Autowired
	public EmployeeDao(DataSource dataSource) {
		simpleJdbcInsert = new SimpleJdbcInsert(dataSource);

	}

	public void save(Employee employee) {
		simpleJdbcInsert.setTableName("Emp_Tbl");
		BeanPropertySqlParameterSource parameterSource = new BeanPropertySqlParameterSource(employee);
		simpleJdbcInsert.execute(parameterSource);

	}

}
