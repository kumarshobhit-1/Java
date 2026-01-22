abstract class Parent2{
    public Parent2(){
        System.out.println("Mai parent2 ka constructor hu");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class Child3 extends Parent2 {
    public void th() {
        System.out.println("I am good");
    }
}
public class Abstract_Classes {
    public static void main(String[] args){
       // Parent2 p = new Parent();  // ---- error throw karen ge
        new Child2();
       // Child3 c3 = new Child3();  // ---- error throw karen ge
    }
}
