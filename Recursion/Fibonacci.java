package Recursion;

public class Fibonacci {

    public void fibIterative(int n){
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " );
        for(int i=2;i<=n;i++){
            System.out.print(n2 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    public int fibRecursive(int n){
        if(n<=1) return n;
        return fibRecursive(n-1) + fibRecursive(n-2);
    }

    public static void main(String args[]){
        System.out.println("Enter value of n");
        int n = Integer.parseInt(System.console().readLine());
        new Fibonacci().fibIterative(n);
        System.out.println("\n" + new Fibonacci().fibRecursive(n));
    }
}
