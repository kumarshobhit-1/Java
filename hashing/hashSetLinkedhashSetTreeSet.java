package hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashSetLinkedhashSetTreeSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("Bengaluru");
        System.out.println("HashSet is store in unorderd : "+hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println("LinkedHashSet stored in insertion way : "+ lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println("TreeSet Sorted in Ascending Order : " + ts);
    }
}
