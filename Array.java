
public class Array {
    public static void main(String[] args) {
        int[] []array = new int[2][2];
        array[0][0] = 80;
        array[0][1] = 20;
        array[1][0] = 40;
        array[1][1] = 60;
    for(int i = 0; i < array.length; i++) {
        for(int j = 0; j<array[i].length; j++){
            System.out.print(array[i][j]+" ");
        }
        System.out.println(" ");
        }
    int array1[][]=new int [2][3];
            array1[0][0] = 20;
            array1[0][1] = 10;
            array1[0][2] = 50;
            array1[1][0] = 60;
            array1[1][1] = 40;
            array1[1][2] = 70;

            for(int i1=0; i1<array1.length; i1++ ){
            for(int j1=0; j1<array1[i1].length; j1++){
                System.out.print(array1[i1][j1]+" ");
            }
            System.out.println(" ");
        }
    }
}
