package com.srikantvs.java8.learnings;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class BackForth {

	public static void main(String[] args) {
		
		ResultEmployeeDto resultEmployeeDto = new ResultEmployeeDto();
		List<String> employees = new ArrayList<String>();
		// we are passing the same to both of the methods.
		resultEmployeeDto.setEmployeesNames(employees);
		resultEmployeeDto.setEmployeesIds(employees);
		testMe(resultEmployeeDto);
		
	}
	
	private static void testMe(ResultEmployeeDto resultEmployeeDto) {
		
		if(null != resultEmployeeDto.getEmployeesIds()) {
			resultEmployeeDto.getEmployeesIds().add("What");
			resultEmployeeDto.getEmployeesIds().add("the");
			resultEmployeeDto.getEmployeesIds().add("hell");
		}
		
		//debug here and see we have changed list in getEmployeesIds but it is impacting in other getEmployeesNames as well.
		
		System.out.println(resultEmployeeDto.getEmployeesIds());
		System.out.println(resultEmployeeDto.getEmployeesNames());
		
		
	
	}
	
}
