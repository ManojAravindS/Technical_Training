import java.util.Scanner;
public class index_key{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ind = -1;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int key = sc.nextInt();
		for(int i = 0; i < n; i++){
			if(arr[i] == key){ 
				ind = i;
				break;
			}
		}
		System.out.println(ind == -1 ? "Not found" : ind);
	}
}