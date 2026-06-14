//Printing from 1 to N using backtracking => i-1;
public class BackTracking1toN {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 5;
        sol.Bktrk(n, n);
    }
}

class Solution{
    public void Bktrk(int i,int n){
        if(i<1){
            return;
        }
        Bktrk(i-1,n);
        System.out.println(i);
    }
}