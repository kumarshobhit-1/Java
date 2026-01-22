interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("taking snap");
    }
    //    public void record4KVideo(){
//        System.out.println("taking snap and recording in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networksList ={"Harry", "Prashant", "Anjali5G"};
        return networksList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class Polymorphism_using_Interfaces {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2();   // This is a smartphone but, use it as a camera
        // cam1.getNetworks(); ---> Not Allowed
        // cam1.sampleMeth();  ---> Not Allowed
        cam1.record4KVideo();
        cam1.recordVideo();
        cam1.takeSnap();

        MyWifi2 wi1 = new MySmartPhone2();
        wi1.getNetworks();

        MyCellPhone2 cell = new MyCellPhone2();
        cell.callNumber(100);
        cell.pickCall();
    }
}