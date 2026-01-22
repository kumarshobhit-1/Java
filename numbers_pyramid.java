import java.util.*;
public class numbers_pyramid {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in); 
        System.out.print("enter number : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){  // outer loop for rows 
            for(int j=1; j<=n-i+1; j++){ // inner loop for numbers 
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}