import java.util.Scanner;
public class odd_or_even_bitwise{
	public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if((num&1) == 1){
			System.out.println("Odd");
		}else{
			System.out.println("Even");
		}
	}
}


//Write the program find given number odd or even