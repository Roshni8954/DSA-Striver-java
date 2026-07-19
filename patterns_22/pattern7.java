package patterns_22;

public class pattern7 {
    public void solution(int n){

    for(int i=0;i<n;i++){
        for(int l=0;l<n-i-1;l++){
        System.out.print(" ");
        }

        for(int j=0;j<2*i+1;j++){
            System.out.print("*");            
        }

        for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
        }
    System.out.print("\n");
}
}

public static void main(String args[]){
    new pattern7().solution(5);
}
}

/*  Complexity Analysis

Time Complexity: O(N²), since nested loops print about N² characters overall.

Space Complexity: O(1), as no extra data structures are required.
 */