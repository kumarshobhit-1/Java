import java.util.*;
public class condition {
    public static void main(String[] args) {
        // Scanner  sc = new Scanner(System.in);
        // System.out.print("enter your age : ");
        // int age =  sc.nextInt();
        // if (age >=18) {
        //     System.out.println("you are Adult");
        // } else {
        //     System.out.println("you are child");
        // }
        // sc.close();


        // //  Print largest number
        // int a = 10;
        // int b = 3;
        // if (a>b) {
        //     System.out.println("A is greater than B");
        // } else {
        //     System.out.println("b is less than A");
        // }


        // // Income Tax Calculaor
        Scanner sc   = new Scanner(System.in); 
        System.out.print("enter your income : ");
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000){
            tax = (int) (income * 0.02);
        } else {
            tax = (int) (income * 0.03);
        }

        System.out.println("your tax is " + tax);
        sc.close();


        // Tenary  operator
        int number = 4;
        String type = ((number%2)==0)?"even":"odd";
        System.out.println(type);

        int marks = 67;
        String status = marks>=33 ? "PASS" : "FAIL";
        System.out.println(status);
    }
}
