class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir!");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class Practice__3 {
    public static void main(String[] args) {
        // Question 3
        Human hu = new Human();
        hu.speak();
        hu.jump();
        hu.bite();
        hu.eat();
        hu.sleep();
        // Question 5

        Monkey mo = new Human();
        mo.bite();
    }
}
