package java_coding_problems;

import java.util.Comparator;
import java.util.List;

public class Ex104MinMaxAvgStudent {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("John");
        s1.setWeight(230);

        Student s2 = new Student();
        s2.setName("Gordon");
        s2.setWeight(43);

        Student s3 = new Student();
        s3.setName("Elias");
        s3.setWeight(450);

        List<Student> students = List.of(s1, s2);

        // find the student with max weight
        Student heaviestStudent = getHeaviestStudentV1(s1, students);

        System.out.println("Heaviest Student is :: " + heaviestStudent);

        // using comparable
        Student heaviestStudent2 = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).compareTo(heaviestStudent2) > 0) {
                heaviestStudent2 = students.get(i);
            }
        }
        System.out.println("Heaviest student is :: " + heaviestStudent2);

        // using comparator
        Comparator<Student> weightComparator = Comparator.comparingInt(x -> x.getWeight());
        Student heaviestStudent3 = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (weightComparator.compare(students.get(i), heaviestStudent3) > 0)
                heaviestStudent3 = students.get(i);
        }

        System.out.println("Heaviest Student is :: " + heaviestStudent3);
    }

    private static Student getHeaviestStudentV1(Student s1, List<Student> students) {
        return students.stream().reduce(s1, (p, q) -> {
            if (p.getWeight() > q.getWeight())
                return p;
            else
                return q;
        });
    }
}
