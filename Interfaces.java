interface Bicycle{
    // int a = 4;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HarryBicycle{
    void blowHornk3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle, HarryBicycle{
    int a = 4;
    void blowHorn() {
        System.out.println("Pee Pee Poo Poo");
    }
    @Override
    public void applyBreak(int decrement) {
        System.out.println("Applying Break");
    }
    @Override
    public void speedUp(int increment) {
        System.out.println("Apply SpeedUp");
    }
    @Override
    public void blowHornk3g(){
        System.out.println("Kabhi Khushi Kabhi gum pee pee pee pee");
    }

    @Override
    public void blowHornmhn() {
        System.out.println("Main hoo naa Po Po Po Po");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBreak(1);
        // You can create properties in Inheritance
        System.out.println(cycleHarry.a);
        // You cannot modify the properties in Interfaces as they are final

        cycleHarry.blowHornk3g();
        cycleHarry.blowHornmhn();
        cycleHarry.blowHorn();
    }
}
