package com.srikantvs.java8.streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class Streams06ReduceDemo {
	public static void main(String[] args) {
		//reduce : this method is used to reduce the stream into a single value.
		// this is terminal operation.
		// eg. what is sum of all numbers in stream.
		// string with max length in the stream.
		
		// it takes two parameters.
		//		1. default value 
		//		2. BinaryOperator
		
//		BinaryOperator<T> extends BiFunction<T,T,T> 
		
//		it takes 2 input of same type and return also same type.
		
		String studentWithBiggestName = StudentDataBase.getAllStudents()
													.stream()
													.map(eachStudent -> eachStudent.getName())
													.reduce("hello", (name1, name2)->{
														
														if(name1.length()>name2.length()) return name1;
														else return name2;
														
														}
													);
		
		System.out.println(studentWithBiggestName);
		
		
		
		
		// student with highest gpa.
		
		Optional<Student> studentWithHighestGPA = StudentDataBase.getAllStudents()
															.stream()
															.reduce((s1,s2)->{
																if(s1.getGpa()>s2.getGpa())
																		return s1;
																else
																	return s2;
															});
		
		// we can write the above using ternary operator. also.
//		s1.getgpa()>s2.getgpa : s1 : s2
		studentWithHighestGPA.ifPresent(student -> System.out.println(student));
		
		
		
		
		
		
		
		
		
		
		Integer totalMul = Arrays.asList(1,2,3,4,5,6,7)
									.stream()
									.reduce(1, (num1, num2)->num1*num2);
		
//		                                        1,1 ->1
//												1,2-> 2
//												2,3->6
//												6,4->24
//												24,5->120
		
		
		System.out.println(totalMul);
		
		
		
//		without the inital value it will return Optional.
		
		Optional<Integer> totalMulOp = Arrays.asList(1,2,3,4,5,6,7)
											.stream()
											.reduce((num1, num2)->num1*num2);

		
		
		
		
		
	}
}
