package com.srikantvs.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class Streams04ComparatorDemo {
	
	
	public static void main(String[] args) {
		
//		usecase : I want student to be sorted in ascending order of their names.
		// sorted method will do.
		// but what if we want in descending order. then we have to go for Student comparator.
		
//		int compare(T o1, T o2); take two input and return int.
		
		Comparator<Student> studentComparatorWithName = ( s1,  s2)->s1.getName().compareTo(s2.getName());
		
		
		List<Student> studentListAscending = StudentDataBase.getAllStudents()
										.stream()
										.sorted(studentComparatorWithName)
										.collect(Collectors.toList());
										
	    System.out.println(studentListAscending);
	    
	    
	    
//	    now I want in descending.
		

		List<Student> studentListDescending = StudentDataBase.getAllStudents()
										.stream()
										.sorted(studentComparatorWithName.reversed())
										.collect(Collectors.toList());
										
	    System.out.println(studentListDescending);
	    
		
		
	}

}
