package com.srikantvs.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.StudentDataBase;

public class Streams01MapDemo {

	public static void main(String[] args) {
		
//		map() method is used to convert stream from one type to another.
		
		List<String> studentNames = StudentDataBase.getAllStudents() 
													.stream() //Stream<Student>
													.map(takeEachStudent -> takeEachStudent.getName())//Stream<String> 
													.collect(Collectors.toList());
		
		
		System.out.println(studentNames);
		
		
		
		
		
//		usecase : I want all the names of student with all uppercase.
		
		List<String> studentNames2 = StudentDataBase.getAllStudents()
													.stream()
													.map(eachStudent->eachStudent.getName())//Stream<String> in existing case.
													.map(eachStudentName->eachStudentName.toUpperCase())//Stream<String> in uppercase so we are kind transforming elements of stream.
													.collect(Collectors.toList());
		
		
		
		System.out.println(studentNames2);
		
		
	}
	
}
