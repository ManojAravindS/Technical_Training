import java.util.Scanner;
public class q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        int[][] arr = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(choice == 'n') break;
                else{
                    System.out.println("Enter number of index "+i+", "+j);
                    arr[i][j] = sc.nextInt();
                    System.out.println("Do you wish to continue (y/n): ");
                    choice = sc.next().charAt(0);
                }
            }
            if(choice == 'n') break;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(arr[i][j] == 0){
                    arr[i][j] = (int)(10*Math.random());
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
