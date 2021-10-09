package com.srikantvs.java8.streams_terminal;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class Stream002CountingTerminalOpsDemo {

	public static void main(String[] args) {

	    //counting() : count the elements in the stream. Yes, we can do it with count method as well.
	    
	    
	    
		Long studentCount = StudentDataBase.getAllStudents()
		                            .stream()
                    		        .filter(stu->stu.getGpa()>=3.9)
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
