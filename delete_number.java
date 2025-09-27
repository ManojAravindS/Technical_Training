import java.util.Scanner;
public class delete_number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int key = sc.nextInt();
		int temp = n;
		int number = 0; int mul = 1;
		while(temp!=0){
			if(temp%10 != key){
				number += (temp%10)*mul;
				mul = mul * 10;
			}
			temp/=10;
		}
		System.out.println(number);
	}
}