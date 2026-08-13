import java.util.Scanner;
import java.lang.StringBuilder;
public class string_methods{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String s = "HelloWorld";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            int count = 0;
            for(int j = i; j < s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count == 3 || count == 1) sb.append(s.charAt(i));
        }
        System.out.println("Updated String: "+ sb.toString());
    }
}