package com.createiq.oops.aggregation;

public class Department {

	private String deptId;
	private String deptName;
	private String location;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String deptId, String deptName, String location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

}
