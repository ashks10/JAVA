package one;

import java.util.HashMap;
import java.util.Map;

public class WordFreqCounter {
    public static void main(String[] args) {
        String paragraph = "this is a test this is only a test";

        String[] words = paragraph.split(" ");

        Map<String,Integer> map = new HashMap<>();

        for(String word: words){
            map.put(word, map.getOrDefault(word, 0) +1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
