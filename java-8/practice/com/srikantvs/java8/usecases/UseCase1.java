package com.srikantvs.java8.usecases;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class UseCase1 {

	public static void main(String[] args) {
		
		//I want to find out who all are having 'aerobics' as hobby.
		
   Map<String, List<Stream<String>>> collect = StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.groupingBy(student->student.getName(),Collectors.mapping(student->student.getActivities().stream(),Collectors.toList())));
		
		System.out.println(collect);
		
		
		
		Stream<String> flatMap = StudentDataBase.getAllStudents()
		.stream()
		.map(stu->stu.getActivities())
		.flatMap(studnetList->studnetList.stream());
		
		
		
		
		
StudentDataBase.getAllStudents()
				.stream()
				.map(student->student.getActivities().stream().filter(hobby->"aerobics".equalsIgnoreCase(hobby)));
				//.collect(Collectors.groupingBy(student->student.getName(),Collectors.counting()));
		 
		 
		 
//		 System.out.println(collect2);
				
				
				
		
		
	}
	
}
