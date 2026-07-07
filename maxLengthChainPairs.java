import java.util.Arrays;
import java.util.Comparator;

public class maxLengthChainPairs { //O(n log n)
    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        int n = pairs.length;

        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1]; // last selected pair's end //chain end

        for (int i = 1; i < n; i++) {
            if (pairs[i][0] > chainEnd) { //if current pair's start is greater than last selected pair's end
                chainLength++;
                chainEnd = pairs[i][1]; //update last selected pair's end
            }
        }
        System.out.println("Length of maximum size chain is " + chainLength);
    }
}
