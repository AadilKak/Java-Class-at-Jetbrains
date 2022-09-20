import java.util.Scanner;
 
 // Calculate Total Money
 
   public class TotalMoney
   {
      public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);

      int ones, fives, tens, twentys, fiftys, hundreds, Total;              
      // Get the numeric test score.      
      System.out.println("Enter number of 100s");
      hundreds = scanner.nextInt();
      System.out.println("Enter number of 50s");
      fiftys = scanner.nextInt();
      System.out.println("Enter number of 20s");
      twentys = scanner.nextInt();
      System.out.println("Enter number of 10s");
      tens = scanner.nextInt();
      System.out.println("Enter number of 5s");
      fives = scanner.nextInt();
      System.out.println("Enter number of 1s");
      ones = scanner.nextInt();
      
      Total = (hundreds * 100) + (fiftys * 50) + (twentys * 20) + (tens * 10) + (fives * 5) + ones;
      System.out.println("Your Total is $" + Total);  
       }
}          