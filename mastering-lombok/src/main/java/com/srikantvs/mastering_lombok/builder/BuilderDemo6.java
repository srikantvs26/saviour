package com.srikantvs.mastering_lombok.builder;

import lombok.Builder;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderDemo6 {

	// @Builder demo with toBuilder example

	@ToString
	@Builder(toBuilder = true)
	static class Student {

		private String studentName;
		private String studentAddress;
		private Boolean isPassed;

	}

	public static void main(String[] args) {
		Student student = Student.builder()
								.studentName("Murphy")
								.isPassed(false)
								.build();
		
		// Oh no, I created student object I wanted to add studentAddress to student object.
		// I want the same studentName and isPassed.
		Student student2 = student.toBuilder()
								.studentAddress("BLR")
								.build();
		
		log.info("student1 :: {} ",student);  
      	log.info("student2 :: {} ",student2);  
	}
}
