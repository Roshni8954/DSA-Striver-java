package patterns_22;

public class pattern12 {
    public void solution(int n){
       int flag = 2*(n-1);

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j);

            for(int j=1;j<=flag;j++)
                System.out.print(" ");

            for(int j=i;j>=1;j--)
                System.out.print(j);

            System.out.println();
            flag-=2;
        }
    }

public static void main(String args[]){
    new pattern12().solution(4);
}
}

/*  Complexity Analysis

Time Complexity: O(N²), as each row involves printing up to 2N characters.

Space Complexity: O(1), only a few variables are used for computation.  
*/