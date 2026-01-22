class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My name is "+ name);
        System.out.println("and my id is "+ id);
        System.out.println("My salary is "+ salary);
    }
}
public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee shobhit = new Employee(); // Instantiating a new Employee Object
        Employee suryansh = new Employee(); // Instantiating a new Employee Object
// Setting Attributes for shobhit OR Setting properties for shobhit
        shobhit.name = "SHOBHIT PATEL";
        shobhit.id = 1437;
        shobhit.salary = 210000000;
// Setting Attributes for suryansh OR Setting properties for suryansh
        suryansh.name = "SURYANSH SONI";
        suryansh.id = 4545;
        suryansh.salary = 220000000;
// Printing the Attributes
        shobhit.printDetails();
        suryansh.printDetails();
        System.out.println(shobhit.name);
        System.out.println(shobhit.id);
        System.out.println(shobhit.salary);
        System.out.println(suryansh.name);
        System.out.println(suryansh.id);
        System.out.println(suryansh.salary);
    }
}
