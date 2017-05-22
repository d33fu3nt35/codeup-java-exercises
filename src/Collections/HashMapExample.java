package Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daniel on 5/22/17.
 */
public class HashMapExample {
    public static void main(String[] args) {

        //KEY - VALUE
        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        System.out.println(map.get("four"));
        System.out.println(map.size());

//        for(int i = 0; i < map.size(); i++){
//            System.out.println(map.get(i));
//        }

        map.forEach((key, value) ->{
            System.out.println("Key: " + key + " " + "Value: " + value);
//            System.out.println("Value: " + value);
        });


    }
}
