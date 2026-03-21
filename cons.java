public class cons {
    public static void main(String[] args) {
        // Mystudent s1 = new Mystudent();
        Mystudent s2 = new Mystudent("shobhit", 12);
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

class Mystudent {
    String name;
    int roll;

    Mystudent() {
        System.out.println("Constructor is called...");
    }

    Mystudent(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}
