package patterns_22;

public class pattern9 {
    public void solution1(int n) {
        for (int i = 0; i < n; i++) {
            for (int l = 0; l < n - i - 1; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public void solution2(int n) {
        for (int i = 0; i < n; i++) {
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((2 * n) - (2 * i + 1)); j++) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        new pattern9().solution1(5);
        new pattern9().solution2(5);
    }
}


/* Complexity Analysis

Time Complexity: O(N²), because there are nested loops that print a total of roughly N² characters.

Space Complexity: O(1), as we use only variables and no extra data structures.  
*/