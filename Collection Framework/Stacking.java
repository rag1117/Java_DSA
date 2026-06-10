import java.util.Stack;

public class Stacking{
    public static void main(String[] args){

        Stack<String> animal = new Stack<>();

        animal.push("ADDUUU");
        animal.push("ANNUU");
        animal.push("POCHUU");

        System.out.println(animal);

        System.out.println(animal.peek());
    }
}