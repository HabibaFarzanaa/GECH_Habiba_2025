package com.dependencyInjection;

public class StartApplication {

	public static void main(String[] args) {
		Address address = new Address("Hassan", "Karnataka");
		Student student = new Student(34, "Arbiya", address);
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		
//		Address address1 = student.getAddress();
//		System.out.println(address1.getCity());
//		System.out.println(address1.getState());
		
		
		
	//2. Setter injection
		
		Address address2 = new Address();
		address2.setCity("Bengaluru");
		address2.setState("Karnataka");
		
		Student student2 = new Student();
		student2.setId(12);
		student2.setName("Habiba");
		//setter Injection
		student2.setAddress(address2);
		
		System.out.println(student2.getId());
		System.out.println(student2.getName());
		
		Address address3 = student2.getAddress();
		System.out.println(address3.getCity());
		System.out.println(address3.getState());
		
	}

}
