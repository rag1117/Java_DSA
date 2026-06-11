class Solution {
    public void set1(int N) {
        int count = 0;
        while(N>0){
            count = count + 1;
            N = N/10;  
        }
        System.out.println("The count is: "+ count);
    }
}


public class CountDigit {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 7789;

        // Call pattern function
        sol.set1(N);
    }
}
