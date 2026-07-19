package patterns_22;

public class pattern18 {
    public void solution(int n){
        for(int i=0;i<n;i++){
            for(char j = (char)('E' - i); j <= 'E'; j++)
                System.out.print(j);

            System.out.print("\n");
        }
    }

public static void main(String[] args) {
    new pattern18().solution(5);
}
}

/*  Complexity Analysis

Time Complexity: O(N2), as We print roughly N*(N+1)/2 characters.

Space Complexity: O(1), as No extra space used apart from variables for iteration. 
*/