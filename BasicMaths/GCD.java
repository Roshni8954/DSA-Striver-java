package BasicMaths;
import java.util.Scanner;

public class GCD {
    public void BruteSolution(int num1,int num2){
        int gcd = 1;

       // TC = O(min(num1,num2))

        for(int i=1;i<=Math.min(num1,num2);i++){
            if(num1%i == 0 && num2%i == 0) gcd = i;
        }
        System.out.println("GCD: " + gcd);
    }

    public void Solution2(int num1,int num2){
        for(int i= Math.min(num1,num2);i>=1;i++){
            if(num1%i == 0 && num2%i == 0){
                System.out.println("GCD " +i);
                break;
            }
        }
    }

    public int EquilateralAlgo(int num1,int num2){

        // TC = O9=(log fi(min(num1,num2)))

        while(num1>0 && num2>2){
            if(num1>num2) num1 = num1 % num2;
            else num2 = num2 % num1;
        }
        if(num1 == 0) return num2;
        else return num1;
    }

    public void main (String arrgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        new GCD().BruteSolution(num1,num2);
        new GCD().Solution2(num1,num2);
       int n =  new GCD().EquilateralAlgo(num1,num2);
       System.out.println("LCM is " + (num1*num2)/n);

        sc.close();
    }
}

