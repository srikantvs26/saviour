package com.srikantvs.java8.local_variable_type_inference;

import java.util.List;
import java.util.function.BinaryOperator;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class TypeInference_Basic {

    public static void main(String[] args) {

        var x = 20;
        System.out.println(x);

        // ===============================================================================
        var countryName = "India";
        System.out.println("countryName :: " + countryName);
        // ===============================================================================

        List<Student> allStudents1 = StudentDataBase.getAllStudents();
        var allStudents2 = StudentDataBase.getAllStudents();

        System.out.println(allStudents1);
        System.out.println(allStudents2);

        // ==============================================================================

        BinaryOperator<Integer> multiplyBinaryOperator = (num1, num2) -> num1 * num2;
        Integer result1 = multiplyBinaryOperator.apply(23, 34);
        var result2 = multiplyBinaryOperator.apply(45,56);
        
        System.out.println("result1 :: "+result1);
        System.out.println("result2 :: "+result2);

    }

}
