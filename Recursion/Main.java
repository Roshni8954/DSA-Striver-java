package Recursion;

class Pallindrome {
    
    public boolean IsPalindrome(int i, String s) {
        // Base Condition: If i exceeds half of the string, all the elements have been compared
        // and the string is a palindrome, return true.
        if (i >= s.length() / 2) return true;

        // If the start and end characters are not equal, it's not a palindrome.
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        // If both characters are the same, increment i and check start+1 and end-1.
        return IsPalindrome(i + 1, s);
    }

    public static void main(String[] args) {
        Pallindrome solution = new Pallindrome();  // Create an instance of the Pallindrome class

        // Check if the string is a palindrome using the Pallindrome class
        System.out.println(solution.IsPalindrome(0, "Madam"));  // Output true if palindrome, false if not
        System.out.println(solution.IsPalindrome(0, "madam"));  // Output true if palindrome, false if not
    }
}
