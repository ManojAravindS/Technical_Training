import java.util.*;

public class oddEvenSwitchCase {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int a = sc.nextInt();
      switch(a%2){
        case 1:
          System.out.println("ODD");
          break;
        case 0:
          System.out.println("EVEN");
          break;
      }
  }
}