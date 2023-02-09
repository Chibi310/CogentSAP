package com.cogent.assessment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RunningBeans 
{
	
	@Bean(name="monster")
	public Employee getEmployee()
	{
		Employee employee = new Employee();
		employee.setEmpId(0655);
		employee.setEmpName("Delphox");
		employee.setEmpSal(100.0);
		
		return employee;
	}
}