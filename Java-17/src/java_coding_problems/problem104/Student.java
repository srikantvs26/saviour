package java_coding_problems.problem104;

class Student implements Comparable<Student>  {
    String name;
    Integer weight;

    // default constructor is already given by compiler

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", weight=" + weight + "]";
    }

    @Override
    public int compareTo(Student o) {
        // the value 0 if x == y; a value less than 0 if x < y; and a value greater than 0 if x > y
        // x = this.getWeight()
        // y = o.getWeight()
        return Integer.compare(this.getWeight(), o.getWeight());
    }

}