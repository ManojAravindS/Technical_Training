import java.util.Scanner;
public class sum_of_diagonals{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt(); int sum1 = 0, sum2 = 0;
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
				sum1 += (i == j)?arr[i][j]:0;
				sum2 += (i+j == n-1)?arr[i][j]:0;
			}
		}
		System.out.println(sum1 + " " + sum2);
	}
}
		