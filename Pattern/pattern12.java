class Solution {
    public void pattern11(int N) {
        int start = 1;
        for(int i=0;i<N;i++){
            if(i%2==0){
                start = 1;
            }
            else{
                start = 0;
            }
            for(int j=0; j<=i; j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
}

public class pattern12{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern11(N);
    }
}
