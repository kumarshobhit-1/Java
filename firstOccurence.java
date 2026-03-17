public class firstOccurence {
    public static int foundFisrtstOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return foundFisrtstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3,11};
        System.out.println(foundFisrtstOccurence(arr, 11, 0));
    }
}
