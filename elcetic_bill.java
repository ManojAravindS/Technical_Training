import java.util.Scanner;
public class elcetic_bill{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units: ");
		int units = sc.nextInt();
		int price = 0;
		if(units <= 50){
			price += units;
		}else if(units <= 150){
			price += 50 + (units-50)*2;
			if(price>150) price+=price*0.2;
		}else if(units <= 250){
			price += 50 + 100*2 + (units-150)*3;
			price += price*0.2;
		}else{
			price += 50 + 200 + 300 + (units-250)*4;
			price += price*0.2;
		}
		System.out.println("Total Price: "+price);
	}
}