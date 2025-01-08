import java.util.Scanner;

class Temperature{
 public static void main(String []args){
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter the temperature in Celsius :");
  double Celsius = scan.nextDouble();
  
  double Fahrenheit = (Celsius * (9/5)) + 32;
  
  System.out.println("Temperature in Fahrenheit is : " + Fahrenheit);
  scan.close();
  }
}