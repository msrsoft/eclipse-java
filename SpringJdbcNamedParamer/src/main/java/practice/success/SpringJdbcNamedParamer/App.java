package practice.success.SpringJdbcNamedParamer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pratice.success.dao.EmployeeDao;
import pratice.success.util.Employee;
import pratice.success.util.MOCUtil;

public class App 
{
	public static void main( String[] args ){
    	AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MOCUtil.class);
    	EmployeeDao employeeDao = container.getBean(EmployeeDao.class);
    	employeeDao.save(new Employee(33, "NTR", 77777d));
    	container.close();
    	
    
    }
}
