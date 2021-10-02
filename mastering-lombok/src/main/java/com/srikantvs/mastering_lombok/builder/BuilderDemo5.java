package com.srikantvs.mastering_lombok.builder;

import lombok.Builder;
import lombok.ToString;

public class BuilderDemo5 {


	// @Builder demo with setterPrefix example.
	// with is not encouraged read documentation.
	
	@ToString
	@Builder(setterPrefix = "with")
	static class Student {

		private String studentName;
		private String studentAddress;
		private Boolean isPassed;

	}

	public static void main(String[] args) {
		Student student = Student.builder()
								.withStudentName("Murphy")
								.withStudentAddress("BLR")
								.withIsPassed(false)
								.build();

        System.out.println(student);
	}
}
