public class Main {
    public static void main(String[] args) {
        student stud1 = new student(502,"Ashish",86.34);

        student stud2 = new student();
        stud2.setId(52);
        stud2.setName("vijay");
        stud2.setScore(99.7);

        stud1.displaydetails();
        stud2.displaydetails();

    }
}
