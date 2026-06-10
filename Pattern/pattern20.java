class Solution {
    public void pattern20(int N) {
        for(int i = 0; i<N; i++){
            //STARS
            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }            
            //SPACES
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }
            //STARS
            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<=N; i++){
            //STARS
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }            
            //SPACES
            for(int j=0;j<(N*2)-(i*2);j++){
                System.out.print(" ");
            }
            //STARS
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class pattern20{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern20(N);
    }
}
