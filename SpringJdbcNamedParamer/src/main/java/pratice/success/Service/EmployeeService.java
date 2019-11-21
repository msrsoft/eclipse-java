package pratice.success.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pratice.success.dao.EmployeeDao;
import pratice.success.util.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	public void findAll(Employee employee) {
		employeeDao.save(employee);
	}

}
