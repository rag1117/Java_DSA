import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class CollectionClassLearn {
    public static void main(String[] args) {
        List<Integer> nam = new ArrayList<>();
        nam.add(10);
        nam.add(40);
        nam.add(1);
        nam.add(15);
        nam.add(11);
        nam.add(5);

        System.out.println(nam);

        System.out.println(Collections.min(nam));
        System.out.println(Collections.max(nam));
        System.out.println(Collections.frequency(nam, 15));

        Collections.sort(nam);
        System.out.println(nam);
        
        Collections.sort(nam, Comparator.reverseOrder());
        System.out.println(nam);
    }
}
