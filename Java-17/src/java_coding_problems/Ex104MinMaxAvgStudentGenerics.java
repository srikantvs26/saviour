package java_coding_problems;

import java.util.Comparator;

public class Ex104MinMaxAvgStudentGenerics {

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

        Student[] students = { s1, s2, s3 };

        Comparator<Student> byWeight = Comparator.comparingInt(s -> s.getWeight());
        
        Student heaviestStudent = getHeaviestStudent(students, byWeight);
        System.out.println("heaviest student :: "+heaviestStudent);
        Student heaviestStudentV1 = getHeaviestStudentV1(students);
        System.out.println("heaviest student :: "+heaviestStudentV1);

    }

    /**
     * T is Student 
     * getHeaviestStudentV2 method we can pass Array of Students, A comparator of Student or it subtype
     * @param <T>
     * @param t
     * @param c
     * @return
     */

    // PECS, Producer extends, Consumer super, here Comparator c will consume Students so super.
    private static <T> T getHeaviestStudent(T[] t, Comparator<? super T> c) {

        T max = t[0];
        for (T p : t) {
            if (c.compare(p, max) > 0)
                max = p;
        }

        return max;

    }

    /**
     * Can be called by any Type which implements Comparable
     * @param <T>
     * @param t
     * @return
     */
    private static <T extends Comparable<T>> T getHeaviestStudentV1(T[] t) {
       
        T max = t[0];
        for (T p : t) {
            if (p.compareTo(max) > 0)
                max = p;
        }

        return max;

    }
}
