package Recursion;

/* Sum of N numbers -- 2 ways 
1. parameterized
2. functional  
*/

public class SumN {
    public void parameterized(int i, int sum) {
       if(i<1) {
           System.out.println("Sum is " +sum);
           return;
       }
       parameterized(i - 1, sum + i);   
    }

    public int functional(int n){
        if(n < 1){
            return 0;
        }
        return n + functional(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Enter value of n");
        int n = Integer.parseInt(System.console().readLine());
        new SumN().parameterized(n, 0);
        System.out.println("Sum is " + new SumN().functional(n));
    }
}
