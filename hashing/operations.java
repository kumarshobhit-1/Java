package hashing;

import java.util.HashMap;

public class operations {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        //insert O(1)
        hm.put("China", 150);
        hm.put("India", 100);
        hm.put("US", 50);
        

        System.out.println(hm);

        // get - O(1)
        int hr = hm.get("India");
        System.out.println(hr);

        //Contains key - O(1)
        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Indonasia")); //false


        // remove - O(1)
        System.out.println(hm.remove("India"));
        System.out.println(hm.remove("Indonasia")); //null
        System.out.println(hm);

        // isEmpty
        System.out.println(hm.isEmpty());
        
        // clear 
        hm.clear();
        System.out.println(hm.isEmpty());
        
    }
}
