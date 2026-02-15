public class oops {
    public static void main(String[] args) {
        MyPen p1 = new MyPen(); // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(6);
        System.out.println(p1.tip);
    }
}

class MyPen { // class of pen
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}