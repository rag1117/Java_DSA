class Solution {
    public void pattern6(int N) {
        for(int i = 1; i<=N ; i++ ){
            for(int j=0; j<N-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
}
}

public class Pattern6 {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern6(N);
    }
}
