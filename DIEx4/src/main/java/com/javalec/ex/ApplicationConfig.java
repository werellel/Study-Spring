package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("����");
		hobbys.add("�丮");
		Student student = new Student("ȫ�浿");
		student.setAge(10);
		student.setHobbys(hobbys);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("��ȭ����");
		hobbys.add("���ǰ���");
		Student student = new Student("ȫ����");
		student.setAge(5);
		student.setHobbys(hobbys);
		
		return student;
	}
}
