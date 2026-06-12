// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
       int original = n;
       int cube = 0;
       
       while(n>0){
           int last = n%10;
           cube = cube + (last*last*last);
           n = n/10;
       }
       return cube == original;
    }
}

public class Armstrong{
    public static void main(String[] args) {
        int n = 371;
        System.out.println(Solution.armstrongNumber(n));
    }
}


