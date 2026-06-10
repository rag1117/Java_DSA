class Solution {
    public void pattern9(int N) {
        for(int i=0;i<N;i++){
            for(int j=0;j<N+i-N;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*N-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0; j<N+i-N; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

public class pattern9 {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern9(N);
    }
}

