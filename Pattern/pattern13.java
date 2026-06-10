class Solution {
    public void pattern13(int N) {
        int space = 2 *(N-1);
        for(int i = 1; i<=N; i++){
            //number
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            //space
            for(int j = 1; j<=space;j++){
                System.out.print(" ");
            }
            //number
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
            space = space-2;
        }
    }
}

public class pattern13{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern13(N);
    }
}

