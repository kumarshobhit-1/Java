class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am a overload constructor value of x as: " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am a overload constructor of Derived with value of y as: " + y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("i am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am a overload constructor of Derived with value of z as: " + z );
    }
}
public class Constructors_in_inheritance {
    public static void main(String[] args) {
        new Base1();
        new Derived1();
        new Derived1(14, 49);
        new ChildOfDerived(12, 13, 15);
    }
}
