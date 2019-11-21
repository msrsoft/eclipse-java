package pratice.success.dao;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import pratice.success.util.Employee;
@Repository
public class EmployeeInsertDao {
	private NamedParameterJdbcTemplate jdbcTemplate;
	@Autowired
	public EmployeeInsertDao(DataSource dataSource) {
		 jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	public int EmployeeDataInsert(Employee employee) {
		String sql="insert into emp_tbl values(:eno,:name,:salary)";
		HashMap<String, Object> hashMap = new HashMap<String,Object>();
		hashMap.put("eno", employee.getEno());
		hashMap.put("name", employee.getName());
		hashMap.put("salary", employee.getSalary());
		
		int update = jdbcTemplate.update(sql, hashMap);
		return update;

	}

}
