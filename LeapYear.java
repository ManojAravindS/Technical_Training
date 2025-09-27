import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int yr = sc.nextInt();
      System.out.println(yr%4==0?"YES":"NO");
  }
}