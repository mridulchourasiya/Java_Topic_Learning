package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapcode {
    public static void main(String[] args) {
        String [] words = {"apple","banana", "banana", "orange", "banana", "apple","orange"};

        Map<String, Integer> countw = new HashMap<>();

        for (String word: words) {
            countw.put(word, countw.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String ,Integer> entry : countw.entrySet()){
            System.out.println(entry.getKey() + "-" +entry.getValue());
        }


    }

}
