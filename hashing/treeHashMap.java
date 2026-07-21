package hashing;

import java.util.TreeMap;

public class treeHashMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> hm = new TreeMap<>(); 

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

        // // isEmpty
        System.out.println(hm.isEmpty());
        
        // // clear 
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
