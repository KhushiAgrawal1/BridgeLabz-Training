import java.util.Scanner;
public class VolumeOfaCylinder{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius of cylinder: ");
double radius=sc.nextDouble();
System.out.println("Enter height of cylinder: ");
double height=sc.nextDouble();
System.out.println("Volume of Cylinder is : "+3.14*radius*radius*height);
}
}
