package Recursion;

import java.util.*;
import java.util.List;

public class swapArray {
    public int[] Bruteswap(int arr[]) {

        /* Complexity Analysis
           Time Complexity: O(n) Each element is visited once in a loop, where n is the number of elements in the input array.
           Space Complexity: O(n) An additional array of the same size is used to store the reversed elements. 
        */

       int n = arr.length;
       int[] ans = new int[n];
       for(int i=0;i<n;i++)
        ans[i] = arr[n-1-i];

       return ans;
    }

    public int[] betterSwap(int arr[]){
        /* This approach improves on the previous one by reversing the array in-place, avoiding the need for extra space. It uses two pointers to simultaneously traverse the array from both ends, swapping the elements until the center is reached. This way, we avoid creating a new array and perform the reverse operation efficiently using constant space.
            Initialize a pointer p1 at the start of the array (index 0).
            Initialize another pointer p2 at the end of the array (index n - 1).
            While p1 is less than p2, do the following:
            Swap the elements at positions p1 and p2.
            Increment p1 by 1.
            Decrement p2 by 1.
            Continue this process for only the first n/2 elements of the array.
        Note: Swapping all n elements instead of just n/2 would result in the array being reversed twice, which brings it back to its original form. 
        */
        int n = arr.length;
        int p = 0; int q = n-1;

        while(p < q){
            int temp = arr[p];
            arr[p++] = arr[q];
            arr[q--] = temp;
        }

        return arr;
    }

    public void reverseArray(List<Integer> arr){
            Collections.reverse(arr);
    }

    public static void PrintArray(int a[]){
        System.out.println("Swapped array:");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
            System.out.println();
    }

    public static void main(String args[]){
        
        System.out.println("Enter size of the array" );
        int n = Integer.parseInt(System.console().readLine());

        int arr[] = new int[n];
        System.out.println("Enter elements");
        
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(System.console().readLine());

        int ans1[] = new swapArray().Bruteswap(arr);
        PrintArray(ans1);
        int ans2[] = new swapArray().betterSwap(arr);
        PrintArray(ans2);

        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        new swapArray().reverseArray(a);
        System.out.println("Reversed array: " + a);
    }
}
