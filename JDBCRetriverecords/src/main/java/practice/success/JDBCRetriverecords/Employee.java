package practice.success.JDBCRetriverecords;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee {
	private Integer eno;
	private String Name;
	private Double salary;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", Name=" + Name + ", salary=" + salary + "]";
	}
	
	
	
}
