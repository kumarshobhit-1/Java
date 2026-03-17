// Calculate nth term of fibonnaci number
public class fibonacciRecursion {
    public static int fib(int n){
        if (n == 0 || n ==1) {
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static void main(String[] args) {
        int n = 0;
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;;
        System.out.println(fib(n));
        System.out.println(fib(n1));
        System.out.println(fib(n2));
        System.out.println(fib(n3));
        System.out.println(fib(n4));
        System.out.println(fib(n5));
    }
}
