package BasicMaths;
import java.util.Scanner;

public class ReverseNum {
    public void solution(int num){
        int reverseNum = 0; int temp = num; int digit = 0;

        while(temp != 0){
            digit = temp % 10;
            temp = temp / 10;
            reverseNum = reverseNum*10 + digit;
        }
        System.out.println("Reversed Number: " + reverseNum);

        // Pallindrome: when a number is equal to its reverse
        if(num == reverseNum) System.out.println("Pallindrome");
        else System.out.println("Not a Pallindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
       int num = sc.nextInt();
        new ReverseNum().solution(num);

        sc.close();
    }
}

// Inside each iteration, these operations take constant time (O(1)):

// digit = num % 10;
// num = num / 10;
// reverseNum = reverseNum * 10 + digit;

// So,
// Total Time = O(d)
// where d is the number of digits.
