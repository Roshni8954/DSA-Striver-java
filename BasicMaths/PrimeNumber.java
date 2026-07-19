package BasicMaths;
import java.util.Scanner;

public class PrimeNumber {
    public void BruteSolution(int num){
        int count =0;
        for(int i=1;i<=num;i++)
            if(num%i == 0) count++;

           // Tc: O(n)  SC: O(1)

            if(count == 2) System.out.println("Prime number");
            else System.out.println("Not a Prime number");
    }

    public void OptimizedSolution(int num){
        int count = 0;

        // TC = O(sqrt(num))   SC = O(1)
        
        for(int i=1;i*i<=num;i++){
            if(num%i == 0){ 
                count++;
            if(i != num/i) count++;
            }
        }
        if(count == 2) System.out.println("Prime number");
        else System.out.println("Not a Prime number");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        new PrimeNumber().BruteSolution(num);

        sc.close();
    }
}
