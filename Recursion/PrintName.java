public class PrintName {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int N = 5;
        String name = "Anurag";

        sol.namePrint(name, 0, N);
    }
    
}

class Solution{
    public void namePrint(String name, int count, int N ){
        if (count ==N){
            return;
        }
        System.out.println(name);

        //Recursive call with incremented count
        namePrint(name, count+1, N);
    }
}
