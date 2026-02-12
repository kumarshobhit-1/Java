public class setIthBit {
    public static int setIthBit0(int n, int i){
        int bitMask = (1 << i);
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit0(10,2));
    }
}
