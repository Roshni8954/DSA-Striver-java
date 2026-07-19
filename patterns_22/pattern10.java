package patterns_22;

public class pattern10 {
    public void solution(int n){
        for(int i=1;i<2*n+1;i++){
           int flag = i;
           if(i>n) flag = 2*n-i;
           for(int j=1;j<=flag;j++){
            System.out.print("*");
           }
             
            System.out.print("\n");
        }
    }

public static void main(String args[]){
    new pattern10().solution(5);
}
}


/* There are 4 general rules for solving a pattern-based question : 

We always use nested loops for printing the patterns. For the outer loop, we count the number of lines/rows and loop for them.
Next, for the inner loop, we focus on the number of columns and somehow connect them to the rows by forming a logic such that for each row we get the required number of columns to be printed.
We print the ‘*’ inside the inner loop.
Observe symmetry in the pattern or check if a pattern is a combination of two or more similar patterns or not.
In this problem, we have to print only the right half of the star diamond pattern as discussed in the previous article. So, as we can observe from the examples for N = 3 we have 5 rows, and for N = 6 we have 11 rows, hence the outer loop will run for 2*N -1 times. For the inner loop where we print the stars if row no. is less than or equal to N, then we observe that the stars which are printed in each row are equal to the row index itself. But, when i becomes more than N, then the no. of stars decreases by 1 with each increasing row. So, therefore the stars printed would be 2*N - i after i becomes greater than N.

Code:  
*/