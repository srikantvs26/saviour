package com.srikantvs.mastering_lombok.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderDemo7 {

	// @Builder demo with @Builder on a static method.

	@ToString
	@AllArgsConstructor
	static class Student {

		private String studentName;
		private String studentAddress;
		private Boolean isPassed;

		@Builder
		public static Student makeStudent(String name, String add, Boolean res) {
			return new Student(name, add, res);
		}

	}

	public static void main(String[] args) {
		Student student = Student.builder().add("BLR")
				.res(false)
				.name("rabbi")
				.build();

		log.info("student1 :: {} ", student);
	}
}
