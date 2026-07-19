package patterns_22;

public class pattern22 {
    public void solution(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int bottom = 2*n-1 - i - 1;
                int left = j;
                int right = 2*n-1 - j - 1;

                System.out.print(n-Math.min(Math.min(top,bottom), Math.min(left,right)));
            }
            System.out.println();
        }
    }

public static void main(String args[]){
    new pattern22().solution(4);
}
}

// Complexity Analysis

// Time Complexity: O((2N-1)²) ≈ O(N²), since we print every cell once.
// Space Complexity: O(1), only variables for indices are used.
