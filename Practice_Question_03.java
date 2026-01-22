class Cylinder1{
    private int radius;
    private int height;
    public Cylinder1(int radius, int height){
        this. radius = radius;
        this.height = height;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
}
public class Practice_Question_03 {
    public static void main(String[] args) {
        Cylinder1 sc = new Cylinder1(9,12);
        System.out.println(sc.getRadius() + ("cm"));
        System.out.println(sc.getHeight() + ("cm"));
    }
}
