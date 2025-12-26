import java.util.Scanner;

public class FootballTeam
{
    public static int[] generateHeights(int size)
	{
	    int[] heights = new int[size];
		for (int i = 0; i < size; i++)
		{
		    heights[i] = (int)((Math.random()*101)+150);
		}
		return heights;
	}
	
	public static int heightSum(int[] heights)
	{
	    int sum = 0; 
		for (int i = 0; i < heights.length; i++)
		{
		    sum += heights[i];
		}
		return sum;
	}
	
	public static double heightMean(int[] heights)
	{

	    int sum = 0;

		for (int i = 0; i < heights.length; i++)
		{
		    sum += heights[i];
		}
		return sum/heights.length;
	}
	
	public static int heightShortest(int[] heights)
	{
	    int shortIndex = 0; 
		for (int i = 0; i < heights.length; i++)
		{
		    if(heights[i] < heights[shortIndex])
			{
			    shortIndex = i;
			}
		}
		return heights[shortIndex];
	}
	
	public static int heightTallest(int[] heights)
	{
	    int tallIndex = 0; 
		for (int i = 0; i < heights.length; i++)
		{
		    if(heights[i] > heights[tallIndex])
			{
			    tallIndex = i;
			}
		}
		return heights[tallIndex];
	}
	
    public static void main(String[] args)
	{
	    int numberOfPlayers = 11;
		
	    System.out.println("Enter heights of Player: ");
	    int[] playerHeights = generateHeights(numberOfPlayers);
		for(int value : playerHeights)
		{
		    System.out.print(value + " ");
		}
		System.out.println();
		
		int shortestHeight = heightShortest(playerHeights);
        int tallestHeight = heightTallest(playerHeights);
        double meanHeight = heightMean(playerHeights);

        // Display results
        System.out.println("Shortest Height is : " + shortestHeight + " cms");
        System.out.println("Tallest Height is : " + tallestHeight + " cms");
        System.out.println("Mean Height is : " + meanHeight + " cms");
		
	}
}	