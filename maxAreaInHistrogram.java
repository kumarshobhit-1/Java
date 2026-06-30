import java.util.Stack;

public class maxAreaInHistrogram { //O(n) - optimized
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) { // for next greater right - !s.isEmpty() && arr[s.peek()] <= arr[i]
                s.pop();
            }
            if (s.isEmpty()) {
                //-1
                nsr[i] = arr.length;
            } else {
                //top
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //current area
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("max area in histogram = " + maxArea);

    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3}; //heights of histogram
        maxArea(arr);
    }
}
