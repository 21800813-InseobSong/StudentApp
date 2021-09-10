package com.example.lab2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		//Create arraylist of user-defiend class objects
		List<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(101, "Kim", 23);
		al.add(s1); //adding Student class object
		Student s2 = new Student(102, "Lee", 21);
		al.add(s2); //adding Student class object
		Student s3 = new Student(103, "Park", 25);
		al.add(s3); //adding Student class object
		Student s4 = new Student(104, "Choi", 20);
		al.add(s4); //adding Student class object
		Student s5 = new Student(105, "Jeong", 21);
		al.add(s5); //adding Student class object
		Student s6 = new Student(106, "Song", 24);
		al.add(s6); //adding Student class object
		Student s7 = new Student(107, "Cho", 22);
		al.add(s7); //adding Student class object
		Student s8 = new Student(108, "Jin", 21);
		al.add(s8); //adding Student class object
		Student s9 = new Student(109, "Seo", 23);
		al.add(s9); //adding Student class object
		Student s10 = new Student(110, "Ahn", 23);
		al.add(s10); //adding Student class object
		
		Collections.sort(al);
		//Traverse elements of arraylist (ordered)
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		//Traverse elements of arraylist (reverse ordered)
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}
}
