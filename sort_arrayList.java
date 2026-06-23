import java.util.ArrayList;
import java.util.Collections;
public class sort_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        
        System.out.println("Original List : "+list);
        Collections.sort(list); //ascending order
        System.out.println("Ascending order : " + list);

        // Descending order
        Collections.sort(list, Collections.reverseOrder()); // reverseOrder() -: (sort ka logic defined karta hai )Returns a comparator that imposes the reverse of the natural ordering on a collection of objects that implement the Comparable interface.
        System.out.println("Dscending order : " + list);


    }
}

