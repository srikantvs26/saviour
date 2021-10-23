package com.srikantvs.java8.methodreferences;

import java.security.SecureRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.srikantvs.java8.data.StudentDataBase;

public class MethodReference003Demo {

    public static void main(String[] args) {

        // Type: 
        //  a->someObject.method(a);         --> someObject::method
        // (a,b) -> someObject.method(a,b);  --> someObject::method
        // ()-> someObject.method();         --> someObject::method

        
        
        Function<String, Boolean> equalsLambda = str->"Kris".equalsIgnoreCase(str);
        Function<String, Boolean> equalsMR = "Kris"::equalsIgnoreCase;
        
        System.out.println(equalsLambda.apply("Hello"));
        System.out.println(equalsMR.apply("Kris"));
        
        
        //--------------------------------------------------------------------------
        

        SecureRandom secureRandom = new SecureRandom();
        
        Supplier<Integer> secureRandomSupplierLambda = ()-> secureRandom.nextInt();
        Supplier<Integer> secureRandomSupplierMR = secureRandom::nextInt;
        
        System.out.println(secureRandomSupplierLambda.get());
        System.out.println(secureRandomSupplierMR.get());
        
        
        
        //---------------------------------------------------------------------------
        
        Consumer<String> stringConsumerLambda = str->System.out.println(str);
        Consumer<String> stringConsumerMR = System.out::println;//System.out is that someObject
        
        stringConsumerLambda.accept("srikantvs");
        stringConsumerMR.accept("srikantvs");
        
        //---------------------------------------------------------------------------
        
        
        long swimmingHobiesCountMR = StudentDataBase.getAllStudents()
                                                  .stream()
                                                  .flatMap(student->student.getActivities().stream())
                                                  .filter("swimming"::equalsIgnoreCase)
                                                  .count();
        
        System.out.println(swimmingHobiesCountMR);
        
        long swimmingHobiesCountLE = StudentDataBase.getAllStudents()
                                                    .stream()
                                                    .flatMap(student->student.getActivities().stream())
                                                    .filter(activity->"swimming".equalsIgnoreCase(activity))
                                                    .count();

        System.out.println(swimmingHobiesCountLE);
        
        
    }

}
