package patterns_22;

public class pattern16 {
    public void solution(int n){
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.print("\n");
        }
    }

public static void main(String[] args) {
    new pattern16().solution(5);
}
}

/*   Complexity Analysis

Time Complexity: O(N²), because the total number of characters printed is the sum of the first N natural numbers.

Space Complexity: O(1), only loop variables and a character variable are used.
*/
