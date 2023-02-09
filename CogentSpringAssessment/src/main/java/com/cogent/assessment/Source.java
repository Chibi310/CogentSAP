package com.cogent.assessment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Source 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(RunningBeans.class);
		
		Employee monster = context.getBean("monster", Employee.class);
		
		System.out.println("Dex ID: " + monster.getEmpId());
		System.out.println("Species: " + monster.getEmpName());
		System.out.println("Level: " + monster.getEmpSal());
	}

}
