package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		
		Student student2 = ctx.getBean("student", Student.class);
		student1.setName("ȫ����");
		student1.setAge(20);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
		} else {
			System.out.println("student1 != student2");
		}
		
	}
}
