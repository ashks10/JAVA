package one;
import java.util.*;

// Group students by branch
public class GroupByBranch {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ashish", 101, "CSE"));
        students.add(new Student("Sneha", 103, "CSE"));
        students.add(new Student("Ankit", 102, "ECE"));

        Map<String,List<Student>> map = new HashMap<>();

        for(Student s: students){
            map.computeIfAbsent(s.branch, k -> new ArrayList<>()).add(s);
        }

        for(Map.Entry<String, List<Student>> entry : map.entrySet()){
            System.out.println(entry.getKey() +" -> "+entry.getValue());
        }
    }
}
