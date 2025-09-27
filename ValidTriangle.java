import java.util.*;

public class ValidTriangle {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if((a+b+c) == 180&&(a > 0 && b > 0 && c > 0)){
        System.out.println("VALID");
        if(a == b && b == c){
          System.out.println("EQUILALTERAL");
        }
        else if(a==b || b==c || a==c){
          System.out.println("ISOSCELES");
        }
        else{
          System.out.println("SCALENE");
        }
      }
      else System.out.println("NOT VALID");
  }
}