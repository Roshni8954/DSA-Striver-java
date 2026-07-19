package patterns_22;

public class pattern4 {
    public void solution(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new pattern4().solution(5);
    }
}

/*  Complexity Analysis

Time Complexity: O(N²), because there are two nested loops: the outer loop for rows and the inner loop for printing numbers.

Space Complexity: O(1), as only loop variables are used.
 */