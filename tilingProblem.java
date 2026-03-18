public class tilingProblem {
    public static int tileProblem(int n){
        // Base Case
        if (n == 0 || n==1) {
            return 1;
        }
        //work
        // vertical choice
        int fnm1 = tileProblem(n-1);

        // Horizontal choice
        int fnm2 = tileProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tileProblem(3));
    }
}
