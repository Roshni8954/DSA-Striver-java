package patterns_22;

public class pattern15 {
    public void solution(int n){
        for(int i=0;i<n;i++){
            for(char j='A'; j< 'A'+n-i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]){
        new pattern15().solution(5);
    }
}

/* Complexity Analysis

Time Complexity: O(N²), due to the total number of characters printed.

Space Complexity: O(1), only loop variables are used. 
*/