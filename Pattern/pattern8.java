class Solution {
    public void pattern8(int N) {
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i*2+1;k++){
                System.out.print("*");
            }
            for(int l=0; l<N-i-1; l++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

public class pattern8 {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern8(N);
    }
}

