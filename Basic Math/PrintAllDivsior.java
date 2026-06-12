import java.util.ArrayList;
public class PrintAllDivsior {
    public static void main(String[] args) {
        int n = 36;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        System.out.print(arr);
    }
}
//using array list in place of static array beacuse to print array we need another loop which will increase the TC.