public class Resulting {
    public static void main(String[] args) {
        byte x = 6;
        short z = 7;
        int a = 3;
        int y = 3 + a + z + x;

        System.out.println(y);

        // Increment and Decrement
        int i = 56;
        float b = i++;  // First b is assigned then i (56) then i is incremented
        int j = 67;
        int c = ++j;  // First j is increment then c is assigned j is (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        System.out.println(++i);
        System.out.println(i);
        int y1 = 7;
        System.out.println( ++y1 *8);
        char ch = 'z';
        System.out.println(++ch);


    }
}
