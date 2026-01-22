public class Methods {
    static int logic(int x, int y){
        int z;
        if (x > y) {
            z= x+y;
        }
        else {
            z = (x + y) *5;
        }
        return z;
    }
    static int mySum(int a, int b){
        int c;
        if (a < b) {
            c= a+b;
        }
        else {
            c = (a + b) *5;
        }
        return c;
    }

    public static void main(String[] args) {
        int a= 5;
        int b = 7;
        int c;
        c = logic(a, b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);


        int f=15;
        int g = 7;
        int g3;
        g3 = mySum(f, g);
        int h;
        h = mySum(a, b);
        int f1 = 2;
        int g1 = 1;
        int h1;
        h1 = mySum(f1, g1);
        System.out.println(g3);
        System.out.println(h);
        System.out.println(h1);
    }
}
