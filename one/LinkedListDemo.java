package one;
import java.util.*;

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

public class LinkedListDemo {
    public static void main(String[] args) {
        
        List<Student> students = new LinkedList<>();
        
        students.add(new Student("Bobcat", 203, "CSE"));
        students.add(new Student("Mercedes", 204, "IT"));
        students.add(new Student("Bmw", 205, "EEE"));
        students.add(new Student("Ferrari", 206, "ECE"));
        students.add(new Student("Lamborghini", 207, "CSE"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add a new Student");
            System.out.println("2. Delete a Student by Roll Number");
            System.out.println("3. Search for a Student by Roll Number");
            System.out.println("4. Display all Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    //adding new Student
                    System.out.println("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Roll number: ");
                    int roll = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter branch: ");
                    String branch = scanner.nextLine();

                    students.add(new Student(name, roll, branch));
                    System.out.println("New Student Added Succesfully !!");
                    break;
                
                case 2:
                    //Delete a student by roll number
                    System.out.println("Enter Rollnumber to be deleted: ");
                    int rolltodelete = scanner.nextInt();

                    boolean removed = students.removeIf(s -> s.roll == rolltodelete);
                    if (removed) {
                        System.out.println("Student with roll number" + rolltodelete + "has been removed successfully");
                    }else{
                        System.out.println("Student with such roll number not found!?");
                    }
                    break;

                case 3:
                    //Search by roll number
                    System.out.println("Enter the Roll number to be searched");
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
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.println("\n--- All Students ---");
                    for(Student s : students) {
                        System.out.println(s);
                    }
                    break;
                    
                case 5:
                    System.out.println("Exiting");
                    scanner.close();
                    return;


                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}


