import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
    public static void main(String[] args) {
    ArrayList<Integer> List = new ArrayList<>();
    List.add(10);
    
    List.add(0,50);

    // System.out.print(List);


    //2nd Array List
    ArrayList<Integer> ListTwo = new ArrayList<>();
    ListTwo.add(40);

    ListTwo.addAll(List);
    // System.out.print(ListTwo);

    // System.out.print(ListTwo.get(2));

    // ListTwo.remove(1);
    // System.out.print(ListTwo);

    // ListTwo.remove(Integer.valueOf(10));
    // System.out.print(ListTwo);

    // ListTwo.clear();
    // System.out.print(ListTwo);

    // ListTwo.set(1,200);
    // System.out.print(ListTwo);

    // System.out.print(ListTwo.contains(10));

    // for(int i=0;i<ListTwo.size();i++){
    //     System.out.println(ListTwo.get(i));
    // }

    // for(Integer element: ListTwo){
    //     System.out.println(element);
    // }
    

    Iterator<Integer> it = ListTwo.iterator();
    while(it.hasNext()){
        System.out.println(" " + it.next());
    }
    }
}
