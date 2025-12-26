import java.util.Scanner;
class PerimeterOfaRectangle{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter length: ");
double l=sc.nextDouble();
System.out.print("Enter width: ");
double w=sc.nextDouble();
double p=2*(l+w);
System.out.println("Perimeter of Rectangle = "+p);
}
}
