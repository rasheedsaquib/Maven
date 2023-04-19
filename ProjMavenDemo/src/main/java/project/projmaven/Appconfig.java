package project.projmaven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("project.projmaven")
public class Appconfig {
	
	@Bean("employee")
	public Employee getEmployee() {

		Employee emp = new Employee();

		emp.setEmpid(565);
		emp.setEmpname("abdul");
		emp.setEmpsal(231225);
		return emp;

	}
	
	@Bean("address")
	public Address getAddress() {

		Address add = new Address();

		add.setHnum(79845);
		add.setStreet("mahaveer");
		add.setPincode(231225);
		add.setState("tg");
		return add;

	}

}
