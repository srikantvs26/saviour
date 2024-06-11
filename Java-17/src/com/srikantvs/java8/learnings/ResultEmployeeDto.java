package com.srikantvs.java8.learnings;

import java.util.List;

public class ResultEmployeeDto {

	private List<String> employeesNames;
	private List<String> employeesIds;
	
	public ResultEmployeeDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param employeesNames
	 * @param employeesIds
	 */
	public ResultEmployeeDto(List<String> employeesNames,
			List<String> employeesIds) {
		super();
		this.employeesNames = employeesNames;
		this.employeesIds = employeesIds;
	}

	/**
	 * @return the employeesNames
	 */
	public List<String> getEmployeesNames() {
		return employeesNames;
	}

	/**
	 * @param employeesNames the employeesNames to set
	 */
	public void setEmployeesNames(List<String> employeesNames) {
		this.employeesNames = employeesNames;
	}

	/**
	 * @return the employeesIds
	 */
	public List<String> getEmployeesIds() {
		return employeesIds;
	}

	/**
	 * @param employeesIds the employeesIds to set
	 */
	public void setEmployeesIds(List<String> employeesIds) {
		this.employeesIds = employeesIds;
	}

}
