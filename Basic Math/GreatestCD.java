import java.util.*;
public class GreatestCD {
    public static void main(String[] args) {
        // Create object of Solution class
        solution sol = new solution();

        // Define size of pattern
        int N1 = 40;
        int N2 = 20;

        // Call pattern function
        int result = sol.set1(N1,N2);
        System.out.print(result);
        
    }
}

class solution{
    public int set1(int N1, int N2){
        int count = 1;
        for(int i = 1; i<=Math.min(N1,N2); i++){
            if(N1%i==0 && N2%i==0){
                count = i;
            }
        }
        return count;
    }
}