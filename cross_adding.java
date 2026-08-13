import java.util.Scanner;
public class cross_adding{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of Matrices: ");
        int m = sc.nextInt();
        int[][] arr1 = new int[m][m];
        int[][] arr2 = new int[m][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Second Matrix:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] res = new int[m][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                res[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}