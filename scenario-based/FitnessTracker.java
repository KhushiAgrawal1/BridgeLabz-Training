import java.util.Scanner;

public class FitnessTracker
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pushups of 7 days: ");
		int[] pushups = new int[7];
		
		int total = 0;
		int workoutdays = 0;
		
		for (int i = 0; i < 7; i++){
		    pushups[i] = sc.nextInt();
		}
		
		for(int i : pushups)
		{
			if(i == 0)
			{
					continue;
			}	
			total += i;
			workoutdays++;
		}
		
		
		int average = total / 7;
		
		System.out.println("Total pushups : " + total);
		System.out.println("Average : " + average);
		System.out.println("Workout Days : " + workoutdays);
		
	}
	
}
	