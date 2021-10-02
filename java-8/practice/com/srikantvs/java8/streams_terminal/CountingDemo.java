package com.srikantvs.java8.streams_terminal;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class CountingDemo {

	public static void main(String[] args) {

		Long studentCount = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.counting());

		System.out.println(studentCount);

		// how many swimming hobbies are there.
		long count = StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getActivities().stream().anyMatch(
						activity -> activity.equalsIgnoreCase("swimming")))
				.count();

		System.out.println(count);

		long count2 = StudentDataBase.getAllStudents().stream()
				.map(student -> student.getActivities())
				.flatMap(activitiesList -> activitiesList.stream())
				.filter(eachActivity -> eachActivity
						.equalsIgnoreCase("swimming"))
				.count();

		System.out.println(count2);

		
		//----------------------- VVIMP case ------------------------
		
		
		long count3 = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities).flatMap(List::stream)
				.filter("swimming"::equalsIgnoreCase).count();

		System.out.println(count3);

		long countt = StudentDataBase.getAllStudents().stream()
				.map(student ->student.getActivities())
				.flatMap(activitiesList -> activitiesList.stream())
				.filter(eachActivity -> "swimming"
						.equalsIgnoreCase(eachActivity))
				.count();

		System.out.println(countt);
		
	}

}
