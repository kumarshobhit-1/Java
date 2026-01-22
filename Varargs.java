public class Varargs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
   public static int sum(int x, int ...arr){
      // Available as  int [] arr;
        int result =x;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("the sum of 5 is : " + sum(5));
        System.out.println("The sum of 4 and 5 and 7 is :" + sum(4, 5, 7));
        System.out.println("The sum of 4, 5, 7 and 8 is :" + sum(4, 5, 7, 8));
        System.out.println("The sum of 4, 5, 7 and 8 is :" + sum(4, 5, 7, 8, 6));

    }
}
