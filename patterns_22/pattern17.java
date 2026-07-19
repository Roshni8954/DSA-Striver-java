package patterns_22;

public class pattern17 {
    public void solution(int N){
       
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Initialize character to start from 'A'
            char ch = 'A';     // ch initilized inside the loop So, as after every new line it goes back to "A"
            int breakpoint = (2 * i + 1) / 2;

            // Print characters in row
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);

                // Increment or decrement character
                if (j <= breakpoint) ch++;
                else ch--;
            }

            // Print trailing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Newline after each row
            System.out.println();
        }
    }

public static void main(String[] args) {
    new pattern17().solution(5);
}
}

/* Complexity Analysis

Time Complexity: O(N²), because for each of the N rows, up to 2N characters (spaces and letters) may be printed, resulting in O(N²) total operations.

Space Complexity: O(1), as only a constant amount of extra space is used for variables like ch and breakpoint. 
*/