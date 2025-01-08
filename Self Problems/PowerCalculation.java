import java.util.Scanner;

class PowerCalculation{
 public static void main(String []args){
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter base value :");
  int base = scan.nextInt();
  System.out.print("Enter exponent value :");
  int exponent = scan.nextInt();
  
  double result = Math.pow(base , exponent);
  
  System.out.println("The result is : " + result);
  
  scan.close();
  }
}
  