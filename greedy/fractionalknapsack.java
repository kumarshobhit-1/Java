package greedy;
import java.util.Arrays;
import java.util.Comparator;

public class fractionalknapsack {
    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        double ratio[][] = new double[value.length][2];
        // 0th column -> index
        // 1st column -> ratio = value/weight
        for(int i=0; i<value.length; i++){
            ratio[i][0] = i; //index
            ratio[i][1] = (double)value[i]/(double)weight[i]; //value/weight
        }

        //sorting on the basis of ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalValue = 0;

        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                finalValue += value[idx];
                capacity -= weight[idx];
            }else{
                //fractional part
                finalValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("final value = " + finalValue);
    }
}