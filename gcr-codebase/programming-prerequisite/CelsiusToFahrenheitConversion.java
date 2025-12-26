import java.util.Scanner;
public class CelsiusToFahrenheitConversion{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter temperature in Celsius: ");
int celsius=sc.nextInt();
int fahrenheit=(celsius*9/5)+32;
System.out.println("Temperature in Fahrenheit : "+fahrenheit);
}
}
