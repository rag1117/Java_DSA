//there is another solution with 2 pointers: start and end; keep on adding +1 to start and -1 to end to swap;

public class RecusiveArrayRev {
    static void Rev(int arr[],int i){
        if(i>=arr.length/2){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;

        Rev(arr,i+1);
    }
    public static void main(String[] args) {

        int arr[] = {2,4,6,8};
        Rev(arr, 0);
        
        for(int num : arr){
            System.out.print(num+ " ");
        }
    }
}

