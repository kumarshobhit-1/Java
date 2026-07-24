package hashing;
import java.util.HashSet;
public class hashSetOperations {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);

        System.out.println(set);

        boolean s1 = set.contains(5);
        boolean s2 = set.contains(1);
        System.out.println(s1);
        System.out.println(s2);


        set.remove(4);
        System.out.println(set);
    }
}
