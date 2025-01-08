import java.util.Scanner;

class Sum{
  public static void main(String [] args){
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Enter two number ");
  int num1 = scan.nextInt();
  int num2 = scan.nextInt();
  
  int result = num1 + num2;
  System.out.println("Sum is : " + result );
  scan.close();
  }
}