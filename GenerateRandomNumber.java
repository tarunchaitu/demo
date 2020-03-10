import java.util.*;
class GenerateRandomNumber {
   public static void main(String[] args) {
      int counter;
      Random rnum = new Random();
      System.out.println("Random Numbers:");
      System.out.println("***************");
      for (counter = 1; counter <= 9; counter++) {
         System.out.println(rnum.nextInt(1000));
      }
   }
}
