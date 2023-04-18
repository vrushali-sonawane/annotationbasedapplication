package com.BikkadIt;

import org.springframework.stereotype.Component;

/**
 * @author KSAV
 *
 */
@Component("stu")//when we want  to give our customize name to bean
public class Student {
	
	private int id;
	private int name;
	
	public Student() {
		super();
		System.out.println("Student class constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Welcome to BikkadIT");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

}
