import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();

		int original = n;
		int rev = 0;
		while(n>0){
			int last = n%10;
			n = n/10;
			rev = (rev * 10) + last;
		}
		if(rev == original){
			System.out.print("true");
		}
		else{
			System.out.print("false");
		}
        sc.close();
	}
}
