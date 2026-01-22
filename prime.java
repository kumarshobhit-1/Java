import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();

        if(n==2){
            System.out.println(n +" is Prime");
        } else {
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){ // n is a multiple of i (i not equal to 1 or n)
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println(n +" is Prime");
            } else {
                System.out.println(n +" is not prime");
            }
        }
        sc.close();
    }

}
