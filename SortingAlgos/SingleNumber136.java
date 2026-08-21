package SortingAlgos;


//Brute Force approach with Tc: O(n*n) , SC: O(1)
public class SingleNumber136 {
     public static int singleNumber(int[] nums) {
        int num;
        for(int i=0; i<nums.length; i++){
            num  = nums[i];
            for(int j = 1; j < nums.length; j++){
                if(nums[j] == num) break;
                else return nums[i];
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Single Element: " + singleNumber(new int[]{2, 2, 1,3,3,4,4,6,6}));
    }
}
