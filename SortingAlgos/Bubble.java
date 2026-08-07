package SortingAlgos;

import java.util.*;

public class Bubble {
    public static void BubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // It means If I completed an entire pass without swapping anything, the array is already sorted. Stop immediately.
            if (!swapped)
                break;
        }

    }



    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 9, 3, 7 };
        BubbleSort(arr);

        for (int val : arr)
            System.out.print(val + " ");
    }
}

/*   
| Version               | Best      | Average   | Worst     | Space    |
| --------------------- | --------- | --------- | --------- | -------- |
| Brute Bubble Sort     | **O(n²)** | **O(n²)** | **O(n²)** | **O(1)** |
| Optimized Bubble Sort | **O(n)**  | **O(n²)** | **O(n²)** | **O(1)** |

*/