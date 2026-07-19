package BasicMaths;
import java.util.Scanner;
import java.math.*;

public class digitExtraction {
    
    public void solution(int num){
        int count = 0;
        while (num!=0) {
            int digit = num % 10;
            System.out.println(digit);
            count++;
            // TC = O(log10(num))  
            /* If the division is by 2 then TC will be O(log2(num)), If the division is by 5, TC will be O(log5(num)) */  
            num = num/10;
        }
        System.out.println("Number of digits: " + count);
    }

    public void anotherAproach(int num){
    int divisor = 1;
    int temp = num;

    while(temp >= 10){
        divisor *= 10;
        temp /= 10;
    }

    while(divisor > 0){
        int digit = num / divisor;
        System.out.println(digit);

        num = num % divisor;
        divisor /= 10;
    }
    }

    public void byRecusion(int num){
        if(num == 0) return;
        byRecusion(num/10);
        System.out.println(num%10);
    }

// A simple rule to remember
// Code before the recursive call executes while going down the recursion tree.
// Code after the recursive call executes while coming back up (unwinding the call stack).
// Comparison with the Iterative Approach
// Approach	        Time Complexity	    Space Complexity
// while(num != 0)	   O(n)	                 O(1)
// Recursion	       O(n)                  O(n)

 public void byRecusion2(int num){
        if(num == 0) return;
        System.out.println(num%10);
        byRecusion(num/10);
    }

    private void countDigits(int num){
        int count = (int)(Math.log10(num) + 1);
        System.out.println("Total Digits: " + count);
    }


    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.println("Solution....");
        new digitExtraction().solution(num);
        System.out.println("Recusrion....");
        new digitExtraction().byRecusion(num);
        System.out.println("Recusion2....");
        new digitExtraction().byRecusion2(num);
        System.out.println("Another Approach....");
        new digitExtraction().anotherAproach(num);
        new digitExtraction().countDigits(num);

        sc.close();
    }
}

