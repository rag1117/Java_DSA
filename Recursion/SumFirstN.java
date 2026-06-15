//two ways of doing: Paramterized and functional
public class SumFirstN {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 15;
        System.out.println(sol.SumN(n, 0));
    }
}

class Solution { //parameterized way
    public int SumN(int i, int sum) {
        if (i < 1) {
            return sum;
        }
        return SumN(i - 1, sum + i);
    }
}
