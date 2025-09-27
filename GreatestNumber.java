//write the program to find the greatest among three numbers 
import java.util.Scanner;
public class GreatestNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 three Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();		
		int res = (a>b && a>c) ? a : ((b>a && b > c)?b:c);
		System.out.println("Greatest Number: "+res);
	}
}