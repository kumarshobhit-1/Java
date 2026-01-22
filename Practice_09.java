class Cylinder{
    private int radius;
    private int height;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public double surfaceArea(){
        return 2 * 3.142 * radius * radius + 2 * 3.142 * radius * height;
// 3.142 jo ki pi ki value hai, 3.142 ki jagah hum Math.PI bhi use kar saktee hai jis se ki hume exact value mil sake
    }
    public double Volume(){
        return  3.142 * radius * radius * height;
    }

}
public class Practice_09 {
    public static void main(String[] args) {
        Cylinder mycylinder = new Cylinder();
        mycylinder.setHeight(12);
        mycylinder.setRadius(9);
        int h = mycylinder.getHeight();
        int r = mycylinder.getRadius();
        System.out.println(h +"cm");
        System.out.println(r +"cm");
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.Volume());
    }
}
