package one;
import java.util.*;

public class iteration {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("apple", 3);
        map.put("bannana", 5);
        map.put("orange", 9);

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() +" -> "+ entry.getValue());
        }

        for (String key : map.keySet()) {
        System.out.println(key + " => " + map.get(key));
        }

        for (Integer value : map.values()) {
        System.out.println("Value = " + value);
        }

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " => "+ entry.getValue());
        }
    }
}
