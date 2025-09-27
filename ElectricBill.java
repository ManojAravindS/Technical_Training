import java.util.*;

public class ElectricBill {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double units = sc.nextDouble();
      double price = 0;
      if(units<=50) price += units;
      else if(units <= 150) price += 50 + (units-50)*2;
      else if(units <= 250) price += 50 + 200 + (units-150)*3;
      else if(units > 250) price += 50 + 200 + 300 + (units-250)*4;
      
      if(price > 150) price += price*0.2;
      
      System.out.println((int)price);
  }
}