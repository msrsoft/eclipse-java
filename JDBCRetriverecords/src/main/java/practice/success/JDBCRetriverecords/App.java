package practice.success.JDBCRetriverecords;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import practice.success.Util.MOCUtil;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MOCUtil.class);
		JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);
		String sql = " select * from emp_tbl";
		List<Employee> emplist = jdbcTemplate.query(sql, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setEno(rs.getInt("eno"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getDouble("salary"));

				return employee;
			}
		});

		for (Employee employee : emplist) {
			System.out.println(employee);
		}
	}
}
