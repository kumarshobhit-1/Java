public class hollow {
    public static void main(String[] args) {
        for(int i = 1;  i<=4; i++){ //outer loop - rows
            for(int j = 1; j<=5; j++){ // inner loop - columns
                if (i == 1 ||j == 1 ||i == 4 || j == 5) { // boundry cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}