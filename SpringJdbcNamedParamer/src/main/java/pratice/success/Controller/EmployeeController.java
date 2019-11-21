package pratice.success.Controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import pratice.success.dao.EmployeeInsertDao;
import pratice.success.util.Employee;
import pratice.success.util.MOCUtil;

@Controller
public class EmployeeController {
	public static void main(String[] args) {
		Employee employee = new Employee();
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MOCUtil.class);
		EmployeeInsertDao insert = container.getBean(EmployeeInsertDao.class);
		insert.EmployeeDataInsert(employee);
		container.close();
	}
	
	
}
