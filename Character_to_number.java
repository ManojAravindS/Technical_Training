//convert Character number to integer

import java.util.Scanner;
public class Character_to_number{
	public static void main(String[] args){
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.next().charAt(0);
		System.out.println("Number Format: "+(a-48));
	}
}
		