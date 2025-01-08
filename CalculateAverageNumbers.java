import java.util.Scanner;

class CalculateAverageNumbers{
  public static void main(String [] args){
  
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter three number : ");
  int num1 = scan.nextInt();
  int num2 = scan.nextInt();
  int num3 = scan.nextInt();
  
  double average = (num1 + num2 + num3 ) / 3;
  
  System.out.println("The Average is : " + average);
  scan.close();
  }
}
  
  