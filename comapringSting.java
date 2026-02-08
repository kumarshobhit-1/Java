public class comapringSting {
    public static void main(String[] args) {
        String s1 = "Shobhit";
        String s2 = new String("Shobhit");
        // if(s1 == s2) {
        //     System.out.println("String are equal");
        // } else { 
        //     System.out.println("String are not equal");
        // }

        if(s1.equals(s2)) {
            System.out.println("String are equal");
        } else { 
            System.out.println("String are not equal");
        }
    }

}
