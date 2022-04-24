package com.createiq.emsapp;

public class EmployeeDataImpl implements EmployeeData {

	@Override
	public void getEmpList(Employee[] employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

	@Override
	public void getByEmpId(int id) {
		Employee e1 = new Employee(100, "anil", 12000.00);
		Employee e2 = new Employee(101, "balu", 15000.00);
		Employee e3 = new Employee(102, "raju", 10000.00);
		Employee[] employees = { e1, e2, e3 };
		Employee result = null;

		for (Employee employee : employees) {
			if (employee.getEid() == id) {
				result = employee;
				System.out.println(result);
			}
		}
		if (result == null) {
			System.out.println(" no employee record with that id " + id);
		}
	}

	@Override
	public void getByName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

}
