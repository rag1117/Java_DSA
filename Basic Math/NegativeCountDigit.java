class Solution {
    public int set1(int N) {
        int rev =0;
        while (N!=0) {
            int LastDigit = N%10;
            N = N/10;
            if(rev > Integer.MAX_VALUE/10|| rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev = (rev*10)+LastDigit;
        }
        return rev;
    }
}

public class NegativeCountDigit {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = -2147483648;

        // Call pattern function
        int result = sol.set1(N);
        System.out.print(result);
    }  
}


