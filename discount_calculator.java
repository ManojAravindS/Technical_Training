import java.util.Scanner;
public class discount_calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		if(price > 1000) price -= price*0.2;
		else if(price >= 500 && price <= 1000) price -= price*0.1;

		System.out.println(price);
	}
}