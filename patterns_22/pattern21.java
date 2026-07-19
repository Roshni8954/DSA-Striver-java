package patterns_22;

public class pattern21 {
    public void solution(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j == n-1)  
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

public static void main(String[] args) {
    new pattern21().solution(4);
}
}

// Complexity Analysis

// Time Complexity: O(N2), For each of the n rows, we print n characters.
// Space Complexity: O(1), Only loop counters are used.