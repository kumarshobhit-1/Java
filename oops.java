public class oops {
    public static void main(String[] args) {
        MyPen p1 = new MyPen(); // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(6);
        System.out.println(p1.getTip());

        Student s1 = new Student(); //created student object
        s1.setAge(15);
        System.out.println(s1.age);
        s1.setName("Shobhit");
        System.out.println(s1.name);
        s1.setPercentage(89);
        System.out.println(s1.percentage);
    }
}

class MyPen { // class of pen
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void setName(String newName) {
        name = newName;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    void setPercentage(float newPercentage) {
        percentage = newPercentage;
    }
}