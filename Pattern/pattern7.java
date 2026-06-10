class Solution {
    public void pattern7(int N) {
        for(int i = 1; i<=N ; i++ ){
            for(int j=1; j<=N-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
}
}

public class pattern7{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern7(N);
    }
}

