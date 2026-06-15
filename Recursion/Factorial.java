//two ways of doing: Paramterized and functional
public class Factorial {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        System.out.println(sol.fac(n));
    }
}

class Solution { 
    public int  fac(int n){
        if(n==0){
            return 1;
        }
        return n * fac(n-1);
    }
}


