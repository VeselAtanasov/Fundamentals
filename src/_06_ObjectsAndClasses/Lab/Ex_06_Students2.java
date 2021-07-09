package _06_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_06_Students2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Student> students = new ArrayList<>();

        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String hometown = tokens[3];
            if (!isAlreadyExsit(firstName, lastName, age, hometown, students)) {
                Student student = new Student(firstName, lastName, age, hometown);
                students.add(student);
            }

            input = scan.nextLine();
        }

        String hometown = scan.nextLine();
        for (Student student : students) {
            if (student.getHometown().equals(hometown)) {
                System.out.println(student);
            }
        }
    }

    private static boolean isAlreadyExsit(String firstName, String lastName, int age, String hometown, List<Student> students) {
        for (Student student : students) {
            boolean isFirstNameEqual = student.getFirstName().equals(firstName);
            boolean isLastNameEqual = student.getLastName().equals(lastName);
            if (isFirstNameEqual && isLastNameEqual) {
                student.setAge(age);
                student.setHometown(hometown);
                return true;
            }
        }

        return false;
    }

    public static class Student {
        private final String firstName;
        private final String lastName;
        private int age;
        private String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getHometown() {
            return this.hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String toString() {
            return this.firstName + " " + this.lastName + " is " + this.age + " years old" ;
        }
    }
}