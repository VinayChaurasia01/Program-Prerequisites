import java.util.Scanner;

class SimpleInterest{
 public static void main(String [] args){
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter principle :");
  double principle = scan.nextDouble();
  
  System.out.print("Enter rate of interest :");
  float rate = scan.nextFloat();
  
  System.out.print("Enter time in years :");
  float time = scan.nextFloat();
  
  double interest = (principle * rate * time ) / 100 ;
  
  System.out.println("Simple interest is : " + interest);
  scan.close();
  }
}