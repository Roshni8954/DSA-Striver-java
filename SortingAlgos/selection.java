package SortingAlgos;
import java.util.*;

public class selection {
    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
          
            // Assume the current position holds
            // the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                  
                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }
            }

            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;           
        }
    }

  
    public static void main(String[] args){
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.println("Before Sorting: ");
         for (int val : arr) 
            System.out.print(val + " ");
    
            selectionSort(arr);

        System.out.println("\n" + "After Sorting: ");
         for (int val : arr) 
            System.out.print(val + " ");
    }
}


/*  Time Complexity:O(N^2),Selection sort runs in O(N²) time in the best, average, and worst cases due to its nested loop structure. It makes approximately N(N-1)/2 comparisons, regardless of the array's initial state. Even if no swaps are needed (best case), the number of comparisons remains the same./p>

Space Complexity: O(1). No extra space used
*/