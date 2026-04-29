import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add operation - big 0(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1, 9); //ye ek perticular index pe value dal dete hai baki ke indexes ko aagee bda deta hai
        System.out.println(list);

        // Get operation - big 0(1)
        int element  = list.get(0);
        System.out.println(element);

        // Remove operation - big 0(n)(linear time me perform hota hai)
        list.remove(1);
        System.out.println(list);

        // set element at index operation - big 0(n) (linear time me perform hota hai)
        list.set(2, 6);
        System.out.println(list);


        // contains operation - big 0(n) (linear time me perform hota hai)
        System.out.println(list.contains(3)); // true because of 3 array me exist karta hai
        System.out.println(list.contains(11)); // flase because of 11 array me exist karta hai
    }
}