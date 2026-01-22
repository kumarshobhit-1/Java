public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        //Arithematic Operators
        System.out.println("add = " + (a+b));
        System.out.println("differece = " + (a-b));
        System.out.println("multiply = " + (a*b));
        System.out.println("divide = " + (a/b));
        System.out.println("modulo(remainder) = " + (a%b));
        //Relational Operators 
        System.out.println((a==b));
        System.out.println((a!=b));
        System.out.println((a<b));
        System.out.println((a>b));
        System.out.println((a<=b));
        System.out.println((a>=b));
        //Logical Operators
        System.out.println((a>b)&&(b<a));
        System.out.println((a>b)||(b>a));
        System.out.println(!(a>b));
       
    }
}
