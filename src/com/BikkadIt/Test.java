package com.BikkadIt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static  void main(String[]args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		//Student stu = context.getBean("student",Student.class); //by default by this name bean is created
		Student stu = context.getBean("stu",Student.class);
		stu.display();
	

}
}