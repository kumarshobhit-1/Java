public class Precedence {
    public static void main(String[] args){
        // Precedence & Associativity

        // int a = 6*5-34/2;
        /*
           =30-34/2
           =30-17
           =13
         */
        //int b = 60/5-34*2;
        /*
        Highest precednce goes to * and /. They are then evaluated on the basis
        of left to right associativity
           = 12-34*2
           = 12-68
           = -56
         */
        // System.out.println(a);
        // System.out.println(b);

        // Quick Quiz
        int x = 6;
        int y = 5;
        int k = x * y/2;
        System.out.println(k);
    }
}
