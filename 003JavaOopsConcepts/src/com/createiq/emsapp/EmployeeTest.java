package com.createiq.emsapp;

import java.util.Arrays;

public class EmployeeTest {
//	public static void empTest(){
//	EmployeeDataImpl impl = new EmployeeDataImpl();
//	impl.getEmpList(employees);
//	}
	public static void main(String[] args) {

		EmployeeDataImpl impl = new EmployeeDataImpl();
//		Arrays.toString(a)
//		impl.getEmpList(employees);
		impl.getByEmpId(1000);
		
		
	}

}
