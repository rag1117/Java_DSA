class Solution {
    public void pattern11(int N) {
        for(int i=1;i<=2*N-1;i++){
            int star = i;
            if(i>N){
                star = 2*N-i;
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class pattern11 {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern11(N);
    }
}
