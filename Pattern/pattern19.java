class Solution {
    public void pattern19(int N) {
        char count = 'E';
        for(int i = 1;i<=N;i++){
            for(char ch = count; ch<= count+i-1; ch++){
                System.out.print(ch+ " ");
            }
            System.out.println();  
            count--;
        }
    }
}

public class pattern19{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern19(N);
    }
}



