// import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
public class LearnMap {
    public static void main(String[] args) {
        // Map<String,Integer> num = new HashMap<>();
        Map<String,Integer> num = new TreeMap<>();

        num.put("Anurag", 1);
        num.put("Aditi", 3);
        num.put("Four", 4);

        System.out.println(num);
        // num.putIfAbsent("Four", 4);
        // System.out.println(num);

        //iteration
        // for(Map.Entry<String,Integer> e:num.entrySet()){
        //     System.out.println(e);
        // }

        // for(String key: num.keySet()){
        //     System.out.println(key);
        // }

        // for(Integer val:num.values()){
        //     System.out.println(val);
        // }

        //treemap 
        num.remove("Four");
        System.out.println(num);

    }
}
