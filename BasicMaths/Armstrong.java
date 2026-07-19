package BasicMaths;
import java.util.Scanner;

//An Armstrong number (or narcissistic number) is an n-digit number that equals the sum of its own digits each raised to the power of n. For example, 153 is a 3-digit Armstrong number because 1³ + 5³ + 3³ = 1 + 125 + 27 = 153

public class Armstrong {
    public void solution(int num){
        int temp = num; int digit = 0; int sum = 0;  int count = 0;

        while(temp > 0){
            digit = temp % 10;
            temp = temp / 10;
            count  = (int)(Math.log10(num) + 1);  // will give the total digits of the number
            sum += Math.pow(digit, count); // Assuming n-digit Armstrong number

        }
        if(num == sum) System.out.println("Armstrong number");
        else System.out.println("Not an Armstrong number");
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        new Armstrong().solution(num);

        sc.close();
    }
}
