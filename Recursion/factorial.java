package Recursion;

public class factorial {
    public int fact(int n){
        if(n == 0) return 1;
        return n*fact(n-1);
    }

    public static void main(String args[]){
        System.out.println("Enter value of n to calculate factorial");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println("Factorial is " + new factorial().fact(n));
    }
}
