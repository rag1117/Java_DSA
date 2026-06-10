class Solution {
    public void pattern17(int N) {
        char alpha = 'A';
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(alpha);
            }
            System.out.println();
            alpha++;
        }
    }
}

public class pattern17{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern17(N);
    }
}