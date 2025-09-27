import java.util.Scanner;
public class reverse_digits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a, rev = 0;
		while(temp != 0){
			rev = rev*10 + temp%10; temp /= 10;
		}
		System.out.println(rev);
		System.out.println(rev == a ? "PALINDROME":"NOT A PALINDROME");
	}
}