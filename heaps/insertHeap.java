package heaps;

import java.util.ArrayList;

public class insertHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at last idx
            arr.add(data);

            int x = arr.size()-1; // x is child index
            int par = (x-1)/2; // parent index

            while (arr.get(x) < arr.get(x)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        public int peek(){
            return arr.get(0);
        }


        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*
        }

        public int remove(){
            int data = arr.get(0);

            // step 1 - swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.size()-1);
            arr.set(arr.size()-1, temp);


            //step 2 - delete last
            arr.remove(arr.size()-1);

            //step 3 - heapify

        }
    }
    public static void main(String[] args) {
        
    }
}
