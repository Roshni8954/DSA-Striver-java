package Recursion;
public class recursion1 {
    public void printName(int i, int n){
        if(i>n) return;
    
        /* TC: O(n),   SC: O(n) --> as use stack memory */

            System.out.println("Dora Dora");
            printName(i+1 , n);   /*   why not i++ ? That increment happens inside the current stack frame. Immediately after that, the function calls
                                  printName(1, 3);
                                  The new recursive call receives
                                   i = 1     not 2.
                                So the next function again has i = 1
            */         
    }

    public void PrintNnumbers(int n){
        if(n<=0) return;
        
        PrintNnumbers(n-1);
        System.out.println(n);
        
    }

    public void print1(int i, int n){
        if(i>n) return ;
        System.out.println(i);
        print1(i+1, n);
    }
    public void print2(int i, int n){
        if(i==n) return ;
        System.out.println(i);
        print2(i-1, n);
    }

    public static void main(String args[]){
        System.out.println("Enter value of n");
        int n = Integer.parseInt(System.console().readLine());
        // new recursion1().printName(1,n);
        // new recursion1().PrintNnumbers(n);
        new recursion1().print1(1,n);
    }
}
