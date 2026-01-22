
            //Question no.1
//class Employee1{
//    int salary;
//    String name;
//
//    public int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//}
//    public static void main(String[] args) {
//        Employee1 shobhit = new Employee1();
//        shobhit.salary = 441;
//        shobhit.setName("Patel Shobhit");
//        System.out.println(shobhit.getSalary());
//        System.out.println(shobhit.getName());
//    }

                //Question no.2

  class CellPhone {
      public void ring() {
          System.out.println("Ringing...");
      }
      public void vibrate(){
          System.out.println("Vibrating...");
      }
      public void callFriend(){
          System.out.println("Calling Shobhit...");
      }
  }
public class OOPs_Practice {

       public static void main(String[] args) {
             CellPhone realme = new CellPhone();
             realme.callFriend();
             realme.vibrate();
             realme.ring();
      }
}
