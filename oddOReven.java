public class oddOReven {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("even number");
        } else { //((n & bitMask) == 1)
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(11);
        oddOrEven(0);
        oddOrEven(3);
        oddOrEven(78);
    }

}
