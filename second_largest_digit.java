import java.util.Scanner;
public class second_largest_digit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int slarge = -1, large = 0;
		while(num != 0){
			if(large < num%10){
				slarge = large; 
				large = num%10;
			}
			else if(slarge < num%10 && large > num%10) slarge = num%10;
			num/=10;
		}
		System.out.println(slarge);
	}
}