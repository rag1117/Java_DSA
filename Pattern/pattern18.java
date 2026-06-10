class Solution {
    public void pattern18(int N) {
        for(int i=0;i<N;i++){
            //space
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            //char
            char ch = 'A';
            int breakpoint = (2*i+1)/2; 
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            //space
            for(int l=0; l<N-i-1; l++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

public class pattern18 {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern18(N);
    }
}