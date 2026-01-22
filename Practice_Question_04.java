class rectangle{
    private int length;
    private int breadth;

    public rectangle(){
        this.length = 04;
        this.breadth = 12;
    }
    public rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
public class Practice_Question_04 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
