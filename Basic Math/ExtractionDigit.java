class Solution {
    public void set1(int N) {
        while (N>0) {
            int LastDigit = N%10;
            System.out.println(LastDigit);
            N = N/10;
        }
    }
}

public class ExtractionDigit {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 7789;

        // Call pattern function
        sol.set1(N);
    }
}
