import java.util.*;
public class even {
    public static void isEven(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int a = sc.nextInt();

        if (a %2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
    public static void main(String[] args) {
        isEven();
    }
}
