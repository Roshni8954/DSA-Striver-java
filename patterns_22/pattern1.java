package patterns_22;

public class pattern1 {
    public void solution(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new pattern1().solution(5);
    }
}

// For compiling : javac patterns_22.pattern1.java
// for running : java patterns_22.pattern1