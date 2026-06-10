import java.util.Arrays;

public class ArrayClassLearn {
    public static void main(String[] args) {
        Integer[] num = {10,33,2,40,8,90,43,6};
        
        Arrays.sort(num);
        for(int i:num){
            System.out.print(i + " ");
        }
        System.out.println();

        int index = Arrays.binarySearch(num, 33);
        System.out.println("The index is: "+index);

        Arrays.fill(num,12);
        for(int i : num){
            System.out.print(i + " ");
        }
        
    }    
}
