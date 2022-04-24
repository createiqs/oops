package com.createiq.oops.aggregation;

public class Employee implements Orgnization {

	private int id;
	private String name;
	private double salary;
	private Address[] addressess;
	private Department department;

	public Employee(int id, String name, double salary, Address[] addressess, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addressess = new Address[2];
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddressess() {
		for (Address address : addressess) {
			System.out.println(address);
//			address.getAddress();
			return address;
		}
		return null;

	}
	
	public void getAddressDetails(Address [] addresses) {
//		Address result=null;
	 for(Address address: addresses) {
		 System.out.println(address.getCity());
		 System.out.println(address.getLocation());
	 }
	}

	public void setAddressess(Address[] addressess) {
		this.addressess = addressess;
	}

	public int getId() {
		return id;
	}

	public Department getDepartment() {
		return department;
	}

	@Override
	public void employeeAge() {
	int age=23;
	if(age>=23) {
		System.out.println(" his ");
	}
		
	}

	@Override
	public void passExperience(int years) {
		if(years==1) {
			System.out.println(" program anaylist");
		}else if(years==2) {
			System.out.println(" sofrware developer");
		}
		
	}

}
