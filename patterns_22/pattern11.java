package patterns_22;

public class pattern11 {
    public void solution(int n){
        int start = 1;

        for(int i=0;i<n;i++){
            if(i%2 == 0) start =1;
            else start = 0;

            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.print("\n");
        }

}
 public static void main(String args[]){
            new pattern11().solution(5);
        }
}

/*  Complexity Analysis

Time Complexity: O(N²), due to the nested loop structure where rows grow in length.

Space Complexity: O(1), constant space is used regardless of input size. 
*/