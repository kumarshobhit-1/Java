

public class Break_and_Contiinue {
    public static void main(String[] args) {
        // Break and Continue using loops

        // Break Statement----------------------------------------------------

        //(For loop)

        for(int i=0; i<=50; i++){
            System.out.println(i);
            System.out.println("java is great programing");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }

        //(while loop)


        int l=0;
        while(l<5) {
            System.out.println(l);
            System.out.println("java is great programing");
            if (l == 2) {
                System.out.println("Ending the loop");
                break;
            }
            l++;
        }
        System.out.println("Loops ends here");

        //( Do while loop)


        int g=0;
        do {
            System.out.println(g);
            System.out.println("java is great programing");
            if (g == 2) {
                System.out.println("Ending the loop");
                break;
            }
            g++;
        }while(g<5);
        System.out.println("Loops ends here");


        // Continue Statement------------------------------------------------------


        //(For loop)


        for(int i=0; i<=50; i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great programing");
        }

        //(while loop)

        int i=0;
        while(i<5) {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }

            System.out.println(i);
            System.out.println("java is great programing");

        }

        //( Do while loop)


        int j=0;
        do {
            j++;
            if (j == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(j);
            System.out.println("java is great programing");
        }while(j<5);
        System.out.println("Loops ends here");

    }
}
