package patterns_22;

public class pattern5 {
    public void solution(int n){
        for(int i=0; i<n; i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new pattern5().solution(5);
    }
}

// For compiling : javac patterns_22.pattern1.java
// for running : java patterns_22.pattern1

/* Complexity Analysis

Time Complexity: O(N²), since two nested loops are used.

Space Complexity: O(1), as no extra data structures are needed. 
 */