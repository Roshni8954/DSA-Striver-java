package patterns_22;

public class pattern19 {
    public void solution(int n){
        int space = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("*");

        for(int j=1;j<=space;j++)
            System.out.print(" ");

            for(int j=1;j<=n-i;j++)
                System.out.print("*");

        space +=2;
        System.out.print("\n");
    }

    space = 8;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++)
            System.out.print("*");

        for(int j=space;j>0;j--)
            System.out.print(" ");

        for(int j=1;j<=i;j++)
            System.out.print("*");

        System.out.print("\n");
        space -=2;
    }
}
public static void main(String args[]){
    new pattern19().solution(5);
}
}

/* Complexity Analysis

Time Complexity: O(N2), For each of the N rows, we print up to 2N characters (stars and spaces).

Space Complexity: O(1), No extra space is used apart from loop variables. 
*/
