public class overloading {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        int e = sum(a,b);
        int d = sum(a,b,c);
        System.out.println(e);
        System.out.println(d);

    }
}
