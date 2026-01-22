

public class Method_Overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Have a nice day " + a + " bro!");
    }

    // NOTE -------------------------------------------
    static void change(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    public static void main(String[] args) {
//        int[] marks = {52, 73, 77, 89, 94};
//        change2(marks);
//        System.out.println("The value of x after running change is: " + marks[0]);

        // Method Overloading
        foo();
        foo(300);
    }
}
