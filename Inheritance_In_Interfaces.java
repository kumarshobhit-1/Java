
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
     void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("Good Morning");
    }
    public void meth2(){
        System.out.println("Good Afternoon");
    }
    public void meth3(){
        System.out.println("Good Evening");
    }
    public void meth4(){
        System.out.println("Good Night");
    }
}
public class Inheritance_In_Interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
