package com.createiq.arrays;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee=new Employee();
//		employee.setId(1000);
		employee.setName("anil");
		employee.setSalary(15000.00);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	}
}
