package hashing;

// import java.util.HashSet;
// import java.util.Iterator;
import java.util.*;


public class iterationOnhashset {
    public static void main(String[] args) {
        HashSet<Integer> keys = new HashSet<>();

        keys.add(1);
        keys.add(3);
        keys.add(2);
        keys.add(4);
        keys.add(1);
        keys.add(2);

        // (a) -> using itrator function
        // Iterator it = keys.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        //advanced loop (using foreach loop)
        for (Integer key : keys) {
            System.out.println(key);
        }

    }
}
