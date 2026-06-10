class Solution {
    public void pattern14(int N) {
        for(int i = 1;i<=N;i++){
            char count = 'A';
            for(int j = 1; j<=i;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();  
        }
    }
}

public class pattern15{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern14(N);
    }
}



