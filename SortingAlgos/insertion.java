package SortingAlgos;

public class insertion {
    public static void insertionSort(int arr[]){
        int n = arr.length;

        // Start from index 1 because the first element
        // is considered already sorted
        for(int i=1;i<n;i++){

              // Store the current element
            int key  = arr[i];

            // Start comparing with the element just before key
            int j = i - 1;

            // Shift larger elements one position to the right
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            // Put key into its correct position
            arr[j + 1] = key;

        }
    }

    public static void main(String args []){
        int arr[] = {12,11,13,5,6};

        insertionSort(arr);

        for(int val:arr)
            System.out.print(val + " ");
        System.out.println();
    }
}
