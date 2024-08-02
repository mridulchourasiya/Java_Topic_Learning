package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> number = new TreeMap<>();

        number.put("One" , 1);
        number.put("Two" , 2);
        number.put("Three" , 3);
        number.put("four" , 4);
        number.put("Five" , 5);
        System.out.println(number);
        number.remove("Three");

        // to chack if incert the function the key is inserting the 23 in Two
//        if (!number.containsKey("Two")) {
//            number.put("Two" , 23);
//
//        }

   //     number.putIfAbsent("Two", 23);


        System.out.println(number);
//        for(Map.Entry<String, Integer> e: number.entrySet()){
//            System.out.println(e);
//
//            // show the key
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        // onl return the key set in string value
//        for (String key:number.keySet()){
//            System.out.println(key);
//        }
//
//        // to return the value set
//         for (Integer value: number.values()){
//             System.out.println(value);
//         }
        // check the value is present or not
//        System.out.println(number.containsValue(4));
//        System.out.println(number.isEmpty());

    }
}
