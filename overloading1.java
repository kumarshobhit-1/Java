public class overloading1 {
    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,6));
        System.out.println(sum(7.6f,7.9f));
    }
}
