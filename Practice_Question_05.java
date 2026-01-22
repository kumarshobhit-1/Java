class shape{
    private int radius;

    public void setRadius(int radius){
        this.radius= radius;
    }
    public int getRadius() {
        return radius;
    }

    public double Shape(){
        return 4 * 3.14* radius * radius;
    }
}
public class Practice_Question_05 {
    public static void main(String[] args) {
        shape s = new shape();
        s.setRadius(4);
        int s1 = s.getRadius();
        System.out.println(s1);
        System.out.println(s.Shape());

    }
}
