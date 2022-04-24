package com.createiq.emsapp;

public interface EmployeeData {

	// frequently

	// get list of employees

//	void test();
	void getEmpList(Employee employees[]);

	void getByEmpId(int id);

	void getByName(String name);

	void addEmployee(Employee emp);

	void updateEmployee(Employee employee);

}
