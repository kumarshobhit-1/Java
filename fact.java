public class fact {
    // find factorial number using recursion
    public static int fact1(int n){
        if (n == 0) {
            return 1;
        }
        // int fnm = fact1(n);
        int fn = n * fact1(n-1);
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.err.println(fact1(n));
    }
}
