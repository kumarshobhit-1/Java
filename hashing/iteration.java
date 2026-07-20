package hashing;

import java.util.HashMap;
import java.util.Set;

public class iteration {
    public static void main(String[] args) {
       HashMap<String, Integer> hm = new HashMap<>();

        //insert O(1)
        hm.put("China", 150);
        hm.put("India", 100);
        hm.put("Indonasia", 70); 
        hm.put("Japan", 500); 
        hm.put("Nepal", 30); 
        hm.put("US", 50); 


        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = " + k + ", value = " + hm.get(k));
        }
    }
}
