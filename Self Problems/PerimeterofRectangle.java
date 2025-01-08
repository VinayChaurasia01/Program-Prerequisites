import java.util.Scanner;

class PerimeterofRectangle{
  public static void main(String [] args){
  
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter length of reactangle :");
  float length = scan.nextFloat();
  System.out.print("Enter width of reactangle :");
  float width = scan.nextFloat();
  
  double perimeter = 2*(length + width);
  
  System.out.println("Perimeter of reactangle :" + perimeter );
  scan.close();
  }
}
  