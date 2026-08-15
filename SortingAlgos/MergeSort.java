package SortingAlgos;

/* Merge Sort works using divide and conquer: first, mergeSort() repeatedly divides the array into two halves using mid = (low + high) / 2 until each part contains only 
one element (low >= high). Then recursion starts returning, and merge() combines two already-sorted halves by comparing their elements using left and right pointers and 
putting the smaller element into a temporary array. After one half is exhausted, the remaining elements of the other half are copied into temp. Finally, the sorted elements
from temp are copied back into the original array using arr[low + i]. This process continues until the complete array is sorted.

Revision line:

Divide → recursively sort → compare two halves → merge in sorted order → copy back. 
*/

public class MergeSort {
    public static void mergeSort(int arr[], int low, int high){
        int mid = (low + high )/2;

        if(low >= high) return;

        // Sort left half
        mergeSort(arr,low,mid);

        // Sort right half
        mergeSort(arr,mid+1,high);

        // Merge bothh halves
        merge(arr,low,mid,high);
    }

    public static void merge(int arr[], int low, int mid, int high){

         // Temporary array for current portion
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k =0;

        // Compare elements from both halves
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right])
                temp[k] = arr[left++];
            else
                temp[k] = arr[right++];
            k++;
        }

        // Copy remaining left elements
        while(left <= mid){
            temp[k] = arr[left++];
            k++;
        }

        // Copy remaining right elements
        while(right <= high){
            temp[k] = arr[right++];
            k++;
        }

         // Copy sorted elements back to original array
        for(int i=0; i<temp.length;i++)
            arr[low + i] = temp[i];
    }

    public static void main(String args[]){
        int arr[] = {12,67,43,78,43,89,90,4,0,23,16,11};

        mergeSort(arr,0,arr.length - 1);

        for(int val:arr)
            System.out.print(val + " ");
        System.out.println();
    }
}

/*| Case      | Time Complexity |
| ----------- | --------------- |
| **Best**    | `O(n log n)`    |
| **Average** | `O(n log n)`    |
| **Worst**   | `O(n log n)`    |
| **Space**   | `O(n)`          |
 
*/