public class DSA_24 {
    
     static int arraySum(int arr[]) {
        return arraySumHelper(arr, 0); // Start recursion from index 0
    }

    private static int arraySumHelper(int arr[], int i) {
        if (i >= arr.length) {
            return 0; // Base case: end of array
        }
        return arr[i] + arraySumHelper(arr, i + 1); // Recursive case
    }
    public static void main(String args[]){
        int[] arr = {23,12,0,21};
        System.out.println(arraySum(arr));
    }
}

