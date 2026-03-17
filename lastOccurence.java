public class lastOccurence {
    public static int foundLastOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = foundLastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,5,6,9,5,10,2,3};
        System.out.println(foundLastOccurence(arr, 5, 0));
    }
}
