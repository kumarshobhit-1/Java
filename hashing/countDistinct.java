package hashing;

import java.util.HashSet;

public class countDistinct {
    public static void main(String[] args) {
        int num[] = {4,3,2,5,6,3,4,2,1,5,8,1};
        HashSet<Integer> set = new HashSet<>();

        for (Integer keys : num) {
            set.add(keys);
        }

        System.out.println("ans = " + set .size());
    }
}
