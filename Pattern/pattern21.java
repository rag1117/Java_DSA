class Solution {
    public void pattern21(int N) {
        int space = (2*N)-2;
        for(int i = 1; i<=2*N-1;i++){
            int stars = i;
            if(i>N){
                stars=2*N-i;
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<N){
                space -=2;
            }
            else{
                space +=2;
            }
        }
    }
}

public class pattern21{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern21(N);
    }
}
