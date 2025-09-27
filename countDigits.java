import java.util.Scanner;
public class countDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int nod = 0;
		while(a != 0){
			nod++;
			a/=10;
		}
		System.out.println(nod);
	}
}