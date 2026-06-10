class Solution {
    public void pattern14(int N) {
        for(int i = 1; i<=N; i++){
            char alpha = 'A';
            for(int j = N; j>=i; j--){
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
    }
}

public class pattern16{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern14(N);
    }
}
