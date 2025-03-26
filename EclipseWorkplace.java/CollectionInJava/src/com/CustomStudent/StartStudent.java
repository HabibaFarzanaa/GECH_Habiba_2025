package com.CustomStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {
//lamda is only applicable for function interface
	public static void main(String[] args) {
	Student std1=new Student("Bushra",2,21);
	Student std2=new Student("Farzana",5,11);
	Student std3=new Student("Habiba",1,21);
	Student std4=new Student("Munazza",3,21);
	Student std5=new Student("Lakshmi",10,25);
	Student std6=new Student("Khanum",21,30);
	
	List<Student> students = new ArrayList<>();
	students.add(std1);
	students.add(std2);
	students.add(std3);
	students.add(std4);
	students.add(std5);

	students.add(new Student("Arbiya", 22,23));
	System.out.println("Before");
	System.out.println(students);
	System.out.println("\n");
//	students.remove(0);
//	System.out.println(students);
	Collections.sort(students, (s1, s2) -> s1.getRoll_no() -s2.getRoll_no());
	System.out.println("Sorting the roll number(integer)");
	System.out.println(students);
	
	Collections.sort(students, (s1, s2) -> s1.getAge() -s2.getAge());
	System.out.println("Sorting the age(integer)");
	System.out.println(students);
	
	Collections.sort(students, (s1, s2) -> s1.getName().charAt(0) -s2.getName().charAt(0));
	System.out.println("\n Sorting the names(String)");
	System.out.println(students);
	
	}
}