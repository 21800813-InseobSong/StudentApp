package com.example.lab2;

public class Student implements Comparable<Student>{
	private int no;
	private String name;
	private int age;
		
	public Student(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public int getNo() {
		return this.no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + this.no + ", name=" + this.name + ", age=" + this.age + "]";
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.getName());
	}
}
