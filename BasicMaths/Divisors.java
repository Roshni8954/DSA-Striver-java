package BasicMaths;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {
    public void solution(int num){
        System.out.println("Divisors of " + num + " are: ");

        /* TC: O(n/2) = O(n)
           SC: O(1) */

        for(int i=1;i<=num/2;i++){
            if(num%i == 0) System.out.print(i + " ");
        }
        System.out.print(num + "\n");
    }

    public void AnotherSolution(int num){
      /* Complexity
         Complexity	        Value
         Time Complexity	O(√n)
         Space Complexity	O(√n) (because in the worst case you store about √n divisors) */

        /* Every divisor of a number exists in a pair. For example, for 36, the divisor pairs are (1,36), (2,18), (3,12), (4,9), and (6,6). Notice that if we know one divisor i, we can immediately find its pair using num / i. 
        Also, in every pair, one divisor is always less than or equal to √N and the other is greater than or equal to √N. Therefore, instead of checking all numbers from 1 to N, we only check from 1 to √N (i * i <= num). 
        Whenever num % i == 0, i is a divisor, and num / i is its paired divisor. We print the smaller divisor (i) immediately and store the larger divisor (num / i) in a list. After the loop ends,
        we print the stored divisors in reverse order to get the final output in ascending order. For perfect squares (like 36, 49, 64), when i == num / i, we print it only once to avoid duplicates. */

        ArrayList<Integer> Divisors = new ArrayList<>();

        System.out.print("Divisors are: ");

        for (int i = 1; i * i <= num; i++) {

            if (num % i == 0) {

                // Print smaller divisor
                System.out.print(i + " ");

                // Store larger divisor (avoid duplicate for perfect squares)
                if (i != num / i) {
                    Divisors.add(num / i);
                }
            }
        }

        // Print larger divisors in reverse order
        for (int i = Divisors.size() - 1; i >= 0; i--) {
            System.out.print(Divisors.get(i) + " ");
        }

        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        new Divisors().solution(num);
        new Divisors().AnotherSolution(num);

        sc.close();
    }
}
