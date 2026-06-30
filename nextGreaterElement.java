import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            //1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) { // agar next graterkahee right side nikalne ke liyee to loop change kar denge n tk le jayenge
                s.pop();
            }

            //2 if-else
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            //3 push in s 
            s.push(i);
        }

        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();

        //next Greater right
        //next Greater left
        //next smaller right
        //next smaller left
    }
}
