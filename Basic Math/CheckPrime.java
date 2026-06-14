public class CheckPrime {
    public static void main(String[] args) {
        int N = 7;

        // Call pattern function
        System.out.println(Check.set1(N));
    }
}

class Check {
    static boolean set1(int N) {
        int checkIf=0;
        for(int i=1;i<=N; i++){
            if(N%i==0){
                checkIf = checkIf+i;
            }
        }
        return checkIf == (N+1);
    }
}