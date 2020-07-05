import java.util.*;
class GenerateRandomNumber {
   public static void main(String[] args) {
      int counter,a;
      a = Integer.parseInt(args[0]);
      Random rnum = new Random();
      System.out.println("Random Numbers:");
      System.out.println("********ooo*****");
      for (counter = 1; counter <= 9; counter++) {
         System.out.println(rnum.nextInt(a));
      }
   }
}
