import java.util.*;

public class Grades {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      int e = sc.nextInt();
      double average = (double)(a+b+c+d+e)/5;
      if(average >= 90) System.out.println("A");
      else if(average < 90 && average >= 80) System.out.println("B");
      else if(average < 80 && average >= 70) System.out.println("C");
      else if(average < 70 && average >= 50) System.out.println("D");
      else System.out.println("F");
  }
}