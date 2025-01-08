import java.util.Scanner;

class AreaOfCircle{
  public static void main(String []args){
  
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter the raduis of circle :");
  double radius = scan.nextDouble();
  
  double area = (3.141 * radius * radius);
  
  System.out.println("Area of circle is : " + area );
  scan.close();
  }
 }