package patterns_22;

public class pattern6 {
    public void solution(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new pattern6().solution(5);
    }
}

/* Complexity Analysis

Time Complexity: O(N²), because nested loops iterate across the triangular number of elements.

Space Complexity: O(1), as no extra data structures are used.
 */