// import java.util.*;
public class ArrayRev {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};

        Solution sol = new Solution();
        int [] result = sol.revArray(arr);

        System.out.println("Rev array: ");
        for(int i : result){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class Solution{
    public int[] revArray(int[]arr){
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[n - 1 - i];
        }
        return ans;
    }
}
