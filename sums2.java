//1. sum of array elements
//2. largest element in array and second largest

import java.util.Scanner;
public class sums2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int sum = 0;
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
  		int large = Integer.MIN_VALUE, slarge = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			if(arr[i] > large) large = arr[i];
			else if(arr[i] > slarge && arr[i] != large) slarge = arr[i];
			
		}
		System.out.println(sum); //1st question
		System.out.println(large); //2nd question
		System.out.println(slarge==Integer.MIN_VALUE?"Min not found":slarge);
	}
}
			