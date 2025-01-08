import java.util.Scanner;

class ConvertKilometersToMiles{
  public static void main(String []args){
  
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter value of kilometer :");
  double km = scan.nextDouble();
  
  double miles = km * 0.621371;
  
  System.out.println("Value in miles :" + miles);
  scan.close();
  }
}