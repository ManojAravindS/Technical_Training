import java.util.Scanner;
public class add_digit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); int temp = a; int i = 0;
		int sum1 = 0, sum2 = 0; int nod = 0;
		while(temp!=0){
			i++;
			if(i < 3){
				sum1 = sum1 * 10 + temp%10;
			}nod++;
			temp/=10;
		}int temp2 = sum1; temp = a; sum1 = 0;
		while(temp2 != 0){
			sum1 = sum1 * 10 + temp2%10;
			temp2/=10;
		}
		for(i = 0; i < nod - 2; i++){
			temp/=10;
		}
		sum2 = sum2*10+temp%10; temp/=10;
		sum2 = sum2*10+temp%10; temp/=10; temp2 = sum2;
		sum2 = 0;
		while(temp2 != 0){
			sum2 = sum2*10 + temp2%10;
			temp2/=10;
		}
		System.out.println(sum1+sum2);
	}
}
	
			
		