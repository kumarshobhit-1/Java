package hashing;

import java.util.HashSet;

public class unionAndintersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();

        //union
        for (Integer keys : arr1) {
            set.add(keys);
        }
        for (Integer keys : arr2) {
            set.add(keys);
        }
        System.out.println("union = " + set);

        //intersection
        set.clear();
        for (Integer keys : arr1) {
            set.add(keys);
        }

        int count = 0;
        for(int i=0; i<arr2.length; i++){
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection = " + count + " size");

    }
}
