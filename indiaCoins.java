// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.ArrayList;

public class indiaCoins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int amount = 220;
        int[] result = new int[coins.length];
        int remainingAmount = amount;

        for (int i = coins.length - 1; i >= 0; i--) {
            if (remainingAmount >= coins[i]) {
                result[i] = remainingAmount / coins[i];
                remainingAmount %= coins[i];
            }
        }

        System.out.println("Coins used to make the amount " + amount + ":");
        for (int i = 0; i < coins.length; i++) {
            if (result[i] > 0) {
                System.out.println(coins[i] + " x " + result[i]);
            }
        }


        //2nd approach
        // Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        // Arrays.sort(coins, Comparator.reverseOrder());

        // int countOfCoins = 0;
        // int amount = 590; // Example amount to make change for
        // ArrayList<Integer> ans = new ArrayList<>();

        // for(int i=0; i < coins.length; i++) {
        //     if (coins[i] <= amount) {
        //         while(coins[i] <= amount) {
        //             countOfCoins++;
        //             ans.add(coins[i]);
        //             amount -= coins[i];
        //         }
        //     }
        // }
        // System.out.println("total (min) coins used = " + countOfCoins);
        
        // for(int i=0; i < ans.size(); i++) {
        //     System.out.print(ans.get(i) + " ");
        // }
        // System.out.println();
    }
}

        
        
