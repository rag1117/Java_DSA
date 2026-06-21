//there is another solution with 2 pointers: start and end; keep on adding +1 to start and -1 to end to swap;

public class StringPalindrome {
    static boolean checkPal(int i, String name){
        if(i>name.length()/2){
            return true;
        }
        if(name.charAt(i) != name.charAt(name.length()-i-1)){
            return false;
        }
        return checkPal(i+1,name);
    }
    public static void main(String[] args) {
        String name = "MADAM";
        System.out.println(checkPal(0,name));
    }
}

