package com.createiq.arrays;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee() {

	}

	public Employee(int id, String ename, double salary) {
		this.id = id;
		name = ename;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public void displayEmployeeDetails() {
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(salary);
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public String getName() {
		return this.name;
	}

	public static void add(Employee[] employee, int n, Employee y) {
		Employee[] employees = new Employee[n + 1];
		for (int i = 0; i < n; i++) {
			employees[i] = employee[i];
			employees[n] = y;
		}
		System.out.println(employees);

	}
//	public void setId(int id) {
//		this.id = id;
//	}

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos=new FileOutputStream("employee.txt");
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		Employee employee = new Employee();
		employee.findAllEmps();
//		employee.getEmpid(1000);
//		employee.id=1000;
//		employee.name="anil";

		Employee employee2 = new Employee(1000, "anil", 12000.00);
		employee2.setName("anil b");
		
//		add(employee, 2, employee2);
//		System.out.println(employee.id);
//		System.out.println(employee.name);
//		System.out.println(employee.salary);
//		employee.displayEmployeeDetails();
		System.out.println(employee2.getName());

//		Employee employee2 = new Employee(1001, "ravi", 12000.00);
//		System.out.println(employee2.id);
//		System.out.println(employee2.name);
//		System.out.println(employee2.salary);

//		employee2.displayEmployeeDetails();

//		Employee employee3 = new Employee(1002, "vani", 12000.00);
//		System.out.println(employee3.id);
//		System.out.println(employee3.name);
//		System.out.println(employee3.salary);
//		employee3.displayEmployeeDetails();
//		Employee[] employees = { employee, employee2, employee3 };

//		for (Employee emp : employees) {
////			 emp.displayEmployeeDetails();
//			System.out.println(emp);
//		}

	}

//  get all employees
	public void findAllEmps() {
		Employee employee = new Employee(1000, "anil", 12000.00);
		Employee employee3 = new Employee(1002, "vani", 12000.00);
		Employee employee2 = new Employee(1001, "ravi", 12000.00);
		Employee[] employees = { employee, employee2, employee3 };
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}

	// get employee by id

	public void getEmpid(int id) {
		Employee employee = new Employee(1000, "anil", 12000.00);
		Employee employee3 = new Employee(1002, "vani", 12000.00);
		Employee employee2 = new Employee(1001, "ravi", 12000.00);
		Employee[] employees = { employee, employee2, employee3 };
		Employee result = null;
		for (Employee emp : employees) {
			if (emp.getId() == id) {
				result = emp;
			}
			System.out.println(result);
		}
		if (result == null) {
			System.out.println("please enter valid employee id");
		}

	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getId() {
		return this.id;
	}

	public double getSalary() {
		return this.salary;
	}

}
