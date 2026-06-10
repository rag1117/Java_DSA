class Solution {
    public void pattern14(int N) {
        int count = 1;
        for(int i = 1;i<=N;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(count);
                count=count+1;
            }
            System.out.println();
        }
    }
}

public class pattern14{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern14(N);
    }
}


