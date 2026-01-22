
   class A {
       public int a;
       public int harry() {
           return 5;
       }
       public void meth2() {
           System.out.println("I am a method 2 of class of A");
       }
   }
   class B extends A{
       @Override
       public void meth2(){
           System.out.println("I am a method 2 of class of B");
       }
       public void meth3(){
           System.out.println("I am a method 3 of class of C");
       }
   }
public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
