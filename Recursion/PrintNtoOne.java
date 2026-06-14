public class PrintNtoOne {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int N = 5;

        sol.NtoOne(N, 1);
    }
}

class Solution{
    public void NtoOne(int N, int count){
        if(count>N){
            return;
        }
        System.out.println(N);

        //Recursive call with decremented N
        NtoOne(N-1, count);
    }
}
