package com.srikantvs.mastering_lombok.builder;

import lombok.Builder;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderDemo8 {

	// @Builder demo with @Builder on a constructor

	@ToString
	static class Student {

		private String studentName;
		private String studentAddress;
		private Boolean isPassed;
		
		
		@Builder
		public Student(String stdName, String stdAdd, Boolean isp) {
			this.studentAddress= stdAdd;
			this.isPassed = isp;
			this.studentName = stdName;
		}


	}

	public static void main(String[] args) {
			Student student = Student.builder()
									.stdAdd("Blr")
									.stdName("GG")
									.isp(false)
									.build();
		
		log.info("student1 :: {} ",student);  
	}
}
