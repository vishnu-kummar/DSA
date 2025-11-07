package OOPS;

import OOPS.basics.Student;

public class construtor {
    public static void main(String[] args) {
        Student s = new Student("Mahadev",3,100.1);  // possible because contructor was craeted in that class
        System.out.println(s.name + " "+ s.roll + " "+ s.percentage);
        
    }
}
