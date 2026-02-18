public class cons {
    public static void main(String[] args) {
        // Mystudent s1 = new Mystudent("shobhit");
        Mystudent s1 = new Mystudent();
        // System.out.println(s1.name);
    }
}

class Mystudent {
    String name;
    int roll;

    // Mystudent(String name) {
    //     this.name = name;
    // }
    public Mystudent() {
        System.out.println("Constructor is called...");
    }

    
}
