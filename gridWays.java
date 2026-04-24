public class gridWays {
    public static int gridwayscount(int i, int j, int n, int m){
        //base case
        if (i == n-1 && j == m-1) { //condition for last cell
            return 1;
        } else if (i == n || j == n) { //boundary cross condition
            return 0;
        }

        int w1 = gridwayscount(i+1, j, n, m);
        int w2 = gridwayscount(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 3, m=3;
        System.out.println(gridwayscount(0, 0, n, m));
    }
}
