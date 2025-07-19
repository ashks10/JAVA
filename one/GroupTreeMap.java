package one;

import java.util.Map;
import java.util.TreeMap;

public class GroupTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> marks = new TreeMap<>();

        marks.put(85, "Ashish");
        marks.put(45, "Sneha");
        marks.put(23, "Lokesh");

        for(Map.Entry<Integer,String> entry : marks.entrySet()){
            System.out.println("Marks: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
