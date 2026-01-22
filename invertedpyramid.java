import  java.util.*;
public class invertedpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){ //outer loop for rows
            for(int j = 1; j<=n-i; j++){ // inner loop for spaces
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){ // this loop for * 
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}