import java.util.Set;
// import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetLearning {
    public static void main(String[] args) {
        // Set<Integer> hshset = new HashSet<>();
        // Set<Integer> hshset = new LinkedHashSet<>();
        Set<Integer> hshset = new TreeSet<>();

        hshset.add(50);
        hshset.add(40);
        hshset.add(55);
        hshset.add(82);
        hshset.add(10);

        System.out.println(hshset);
        
        hshset.remove(40);
        System.out.println(hshset);

        System.out.println(hshset.contains(10));
        
        System.out.println(hshset.isEmpty());
        
        System.out.println(hshset.size());
        
        hshset.clear();
        System.out.println(hshset);

    }
}
