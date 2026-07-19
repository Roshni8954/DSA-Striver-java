package patterns_22;

public class pattern20 {
    public void solution(int n){
         int space = 2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int star =i;
            if(i>n) star = 2*n-i;

            for(int j=1;j<=star;j++)
                System.out.print("*");

           
            for(int j=1;j<=space;j++)
                System.out.print(" ");

            for(int j=1;j<=star;j++)
                System.out.print("*");

            System.out.print("\n");
            if(i<n) space-=2;
            else space+=2;
        }
    }

public static void main(String args[]){
    new pattern20().solution(5);
}
}

// Complexity Analysis

// Time Complexity: O(N2), Two nested loops: outer loop runs 2n-1 times, inner loops cumulatively print O(N) characters per row.
// Space Complexity: O(1), No extra space used apart from loop counters