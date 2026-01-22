// Print the sum of two number with using functions and take user input  
import java.util.*;
public class functions2 {
    public static int sumofTwo(int a, int b){ // Parameters or formal  parameters
        int sum = a+b;
        System.out.println("The sum of two numbers is : " +sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        sumofTwo(a,b); // arguments or actual parameters
        sc.close();
    }
}
