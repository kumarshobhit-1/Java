public class optimizePowerOfX {
    public static int optimizePower(int x, int n){
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizePower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // for n is odd
        if (n % 2 !=0 ) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optimizePower(2, 5));
    }
}
