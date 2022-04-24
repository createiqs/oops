package com.createiq.oops.aggregation;

public class EmpDataImpl implements EmployeeData {

	@Override
	public void addEmp() {
		Address addressOne = new Address("sr nagar", "Hyd");
		Address addressTwo = new Address("Hzb", "KNR");
		Address[] addresses = { addressOne, addressTwo };

		Department department = new Department("IT_101", "IT", "new delhi");

//		System.out.println(address);

		Employee employee = new Employee(100, "anil", 15000.00, addresses, department);

	}

	@Override
	public void findAll() {
//		System.out.println(employee.getId());
//		System.out.println(employee.getName());
//		System.out.println(employee.getSalary());
//		employee.getAddressDetails(addresses);
//		System.out.println(employee.getDepartment().getDeptId());
//		System.out.println(employee.getDepartment().getDeptName());
//		System.out.println(employee.getDepartment().getLocation());
		
	}

}
