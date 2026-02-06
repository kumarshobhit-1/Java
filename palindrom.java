import java.util.Scanner;
public class palindrom {
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;
        while (palindrome != 0) {
            reverse = reverse * 10 + palindrome % 10;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
            return false;
    }
    public static void main(String args[]) {
        System.out.print("Please Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if(isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }
        sc.close();
    }
}

