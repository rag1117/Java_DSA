class Solution {
    public void pattern10(int N) {
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

public class pattern10 {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern10(N);
    }
}
