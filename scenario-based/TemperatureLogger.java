import java.util.Scanner;

public class TemperatureLogger
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] temperature = new double[7];
		double sum = 0;
		for (int i = 0; i < 7; i++){
			temperature[i] = sc.nextDouble();
			sum += temperature[i];
		}
		double average = sum / 7;
		System.out.println("Average Temperature : " + average);	
		int max = 0;
		for (int i = 1; i < 7; i++){
			if(temperature[i] > temperature[max]){
				max = i;
			}
		}
		System.out.println("Max Temperature : " + temperature[max]);		
	}
}