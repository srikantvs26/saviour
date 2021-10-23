package com.srikantvs.java8.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class Stream007GroupingBy01TerminalOpsDemo {

    public static void main(String[] args) {

        // groupingBy collector is equivalent to group by in SQL.

        // it is used to group the elements based on some property.

        // output of groupingBy is Map.

        // there are 3 version of grouping By().

        // groupingBy(classifier)
        // groupingBy(classifier, downstream)
        // groupingBy(classifier, supplier, downstream)// supplier is used to
        // override the default Map what we are getting to something like tree
        // map.
        
        
        // groupingby se pehle ye dekh lo ki bhai ye groupby k layaak hai bhi yaa nahi.
        // ab aap group by name nahi kar sakte jab sare name unique hai.
        // isliye group by gender kar sakte hai.
        

        // use case : I want to group students by gender.

        Map<String, List<Student>> studentsByGender = StudentDataBase
                .getAllStudents().stream()
                .collect(Collectors.groupingBy(stu -> stu.getGender()));

        System.out.println(studentsByGender);

        /*
         * {
         * female=[Student{name='Jenny', gradeLevel=2, gpa=3.8,
         * gender='female', activities=[swimming, gymnastics, soccer]},
         * Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female',
         * activities=[swimming, gymnastics, aerobics]}, Student{name='Sophia',
         * gradeLevel=4, gpa=3.5, gender='female', activities=[swimming,
         * dancing, football]}],
         * 
         * male=[Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male',
         * activities=[swimming, basketball, volleyball]}, Student{name='Dave',
         * gradeLevel=3, gpa=4.0, gender='male', activities=[swimming,
         * gymnastics, soccer]}, Student{name='James', gradeLevel=4, gpa=3.9,
         * gender='male', activities=[swimming, basketball, baseball,
         * football]}]
         * }
         * 
         * female key, male key you can see here.
         * 
         */
        
        // With customized key. eg. OUTSTANDING, AVERAGE
        
        
        // use case : group students by gpa.
        Map<String, List<Student>> studentsByGPA = StudentDataBase.getAllStudents()
                                                                .stream()
                                                                .collect(Collectors.groupingBy(student->{
                                                                    if(student.getGpa()>=3.8) return "OUTSTANDING";
                                                                    else return "AVERAGE";
                                                                }));
        
        
        System.out.println(studentsByGPA);
        
        /*
         * {AVERAGE=[Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male',
         * activities=[swimming, basketball, volleyball]},
         * Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female',
         * activities=[swimming, dancing, football]}],
         * 
         * 
         * OUTSTANDING=[Student{name='Jenny', gradeLevel=2, gpa=3.8,
         * gender='female', activities=[swimming, gymnastics, soccer]},
         * Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female',
         * activities=[swimming, gymnastics, aerobics]}, Student{name='Dave',
         * gradeLevel=3, gpa=4.0, gender='male', activities=[swimming,
         * gymnastics, soccer]}, Student{name='James', gradeLevel=4, gpa=3.9,
         * gender='male', activities=[swimming, basketball, baseball,
         * football]}]}
         */
        
        

    }

}
