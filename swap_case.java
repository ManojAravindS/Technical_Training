import java.util.Scanner;
public class swap_case{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some string: ");
        String txt = sc.nextLine();
        for(int i = 0; i < txt.length(); i++){
            if(txt.charAt(i) >= 65 && txt.charAt(i) <= 90){
                System.out.print((char)(txt.charAt(i) + 32));
            }
            else{
                System.out.print((char)(txt.charAt(i) - 32));
            }
        }
    }
}