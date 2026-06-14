//printing from 1to N
public class PrintOneToN {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int N = 5;
        sol.oneToN(N, 1);
    }
}

class Solution{
    public void oneToN(int N, int count){
        if(count>N){
            return;
        }
        System.out.println(count);

        oneToN(N, count+1);
    } 
}