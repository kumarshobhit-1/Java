public class friendsPairingProblem {
    public static int friendsPairing(int n){
        if (n == 1 || n == 2) {
            return n;
        }
        // // choice (Single)
        // int fnm1 = friendsPairing(n-1);
        // // choice (pair)
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1) * fnm2;
        // //total ways
        // int totalWays = fnm1 + pairWays;
        // return totalWays;

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2); // one liner code
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}