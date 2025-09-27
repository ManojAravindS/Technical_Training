import java.lang.Math;
import java.util.Scanner;
public class prime_number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); int found = 0;
		for(int i = 2; i <= Math.sqrt(a); i++)
			if(a%i == 0) found = 1;
		System.out.println(found == 1?"Not Prime":"Prime");
	}
}