public class transpose{
    public static void main(String[] a){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[] row1 = new int[3];
        int[] row2 = new int[3];
        int[] row3 = new int[3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 0) row1[j] = arr[i][j];
                else if(i == 1) row2[j] = arr[i][j];
                else row3[j] = arr[i][j];
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 0) arr[j][i] = row1[j];
                else if(i == 1) arr[j][i] = row2[j];
                else arr[j][i] = row3[j];
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