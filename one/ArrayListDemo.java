package one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    String name;
    int roll;
    String branch;

    Student(String name, int roll, String branch){
        this.name = name;
        this.roll = roll;
        this.branch = branch;
    }

    public String toString(){
        return name + " ( Roll: " +roll+ ", Branch: " +branch + " )";
    }
}

public class ArrayListDemo{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Bobcat", 203, "CSE"));
        students.add(new Student("Mercedes", 204, "IT"));
        students.add(new Student("Bmw", 205, "EEE"));
        students.add(new Student("Ferrari", 206, "ECE"));
        students.add(new Student("Lamborghini", 207, "CSE"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Roll number to be searched: ");
        int searchRoll = scanner.nextInt();

        boolean found = false;

        for(Student s: students){
            if(s.roll == searchRoll){
                System.out.println("Found "+s);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Invalid Roll number!!");
        }
    }
}