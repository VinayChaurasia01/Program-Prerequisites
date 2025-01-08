import java.util.Scanner;

class VolumeOfCylinnder{
 public static void main(String []args){
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter radius of cylinder :");
  double radius = scan.nextDouble();
  
  System.out.print("Enter height of cylinder :");
  double height = scan.nextDouble();
  
  double volume = (3.141*radius*radius) * height;
  
  System.out.println("Volume of the Cylinder : " + volume);
  scan.close();
  }
}