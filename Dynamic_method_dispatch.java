
class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}
class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Aapka swagat hai");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj = new Phone();  //Allowed
        SmartPhone soj = new SmartPhone(); //Allowed
//        SmartPhone obj2 = new Phone();  // Not Allowed
        obj.greet();
        obj.on();
       soj.on();
    }
}
