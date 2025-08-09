package OOPS;

import java.util.*;

//Create Class for Student
class Student {
    String name;
    int age;
    double marks;

    //Method to display student info
    void displayInfo() {
        System.out.println("Name: " + name + " | Age: " + age + " | Marks: " + marks);
    }
}
//Main class
public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Creating array of student
        Student[] students = new Student[5];
        //Input details for students
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(); // Create object

            System.out.println("Enter your Name: ");
            students[i].name = input.nextLine();

            System.out.println("Enter your age: ");
            students[i].age = input.nextInt();

            System.out.println("Enter your marks: ");
            students[i].marks = input.nextDouble();

            input.nextLine(); // clear Buffer
        }
        //Display Details
        System.out.println("\nStudent Details: ");
        for (Student s: students){
            s.displayInfo();
        }
        input.close();
    }
}
