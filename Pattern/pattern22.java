class Solution {
    public void pattern21(int N) {
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==0 || j==0 || i==N-1 || j==N-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

public class pattern22{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern21(N);
    }
}

