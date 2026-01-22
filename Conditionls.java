

import java.util.Scanner;

public class Conditionls {
    public static void main(String[] args){

        // if-else condition
        int age = 55      ;
        boolean cond = (age == 18);
        if(cond) {
            System.out.println("yes boy you can drive!");
        }
        else{
            System.out.println("No boy you can drive yet!");
        }
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("y");
        }
        else{
            System.out.println("N");
        }


        System.out.println("For Logical OR...");

        if (a || b){
            System.out.println("y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("for Logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);


        //else-if clause
        int age_1;
        System.out.println("Enter your Age");
        Scanner sc = new Scanner(System.in);
        age_1 = sc.nextInt();

        if (age_1>56){
            System.out.println("tou are experienced!");
        }
        else if (age_1>46){
            System.out.println("tou are semi-experienced!");
        }
        else if (age_1>36) {
            System.out.println("tou are semi-semi-experienced!");
        }
        else {
            System.out.println("tou are not experienced");
        }
        if (age_1<2) {
            System.out.println("tou are baby!");
        }
        sc.close();



        // Switch case control instructions



        int age2;
        System.out.println("Enter your Age");
        Scanner sca = new Scanner(System.in);
        age2 = sca.nextInt();

        switch (age2) {
            case 18 -> System.out.println("You are going to become a Adult!");
            case 23 -> System.out.println("You are going to join a job!");
            case 60 -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy your life!");
        }
        sca.close();
    }
}
