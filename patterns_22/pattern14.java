package patterns_22;

public class pattern14 {
    public void solution(int n){
       for(int i=0;i<n;i++){
        for(char j='A';j<'A' + n - i;j++)
            System.out.print(j);

        System.out.print("\n");
       }
    }

public static void main(String args[]){
    new pattern14().solution(5);
}
}

/*  Complexity Analysis

Time Complexity: O(N²), as the total number of characters printed is 1 + 2 + ... + N = O(N²).

Space Complexity: O(1), only loop variables are used. 
*/