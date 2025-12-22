// Program Name : HeightsOfPlayers
// Description  : Generates random heights of football players and
//                calculates shortest, tallest, and mean height

public class HeightsOfPlayers
{
    // Method to generate random heights for players
    // minHeight → minimum possible height
    // maxHeight → maximum possible height
    // numberOfPlayers → total players in the team
    public static int[] generateHeights(int minHeight, int maxHeight, int numberOfPlayers)
	{
        // Array to store heights of players
        int[] heights = new int[numberOfPlayers];	

        // Loop to generate random height for each player
	    for (int i = 0; i < numberOfPlayers; i++)
		{
            // Math.random() generates value between 0.0 and 1.0
            // Formula used to generate random height in given range
		    heights[i] = (int)(Math.random() * (maxHeight - minHeight + 1)) + minHeight;
		}

        // Return the generated heights array
		return heights;
	}
	
    // Method to calculate sum of all heights
	public static int sumOfHeights(int[] heights)
	{
		int sum = 0;

        // Enhanced for loop to add each height to sum
		for (int values : heights)
		{
		    sum += values;
		}

        // Return total sum
		return sum;
	}
	
    // Method to calculate mean (average) height
	public static double calculateMean(int[] heights)
	{
        // Get total sum of heights
		int sumOfHeights = sumOfHeights(heights);    	

        // Mean = sum of heights / number of players
		return sumOfHeights / heights.length;
	}
	
    // Method to find the shortest height
	public static int calculateShortestHeight(int[] heights)
	{
        // Assume first player is shortest initially
	    int shortestIndex = 0;

        // Loop to compare heights
		for (int i = 1; i < heights.length; i++)
		{
		    if (heights[i] < heights[shortestIndex])
			{
			    shortestIndex = i;    
			}
		}

        // Return shortest height value
		return heights[shortestIndex];
	}
	
    // Method to find the tallest height
	public static int calculateTallestHeight(int[] heights)
	{
        // Assume first player is tallest initially
	    int tallestIndex = 0;

        // Loop to compare heights
		for (int i = 1; i < heights.length; i++)
		{
		    if (heights[i] > heights[tallestIndex])
			{
			    tallestIndex = i;    
			}
		}

        // Return tallest height value
		return heights[tallestIndex];
	}
	
    // Main method – program execution starts here
    public static void main(String[] args)
	{
        // Minimum and maximum height range in cms
	    int minHeight = 150;
		int maxHeight = 250;

        // Total number of players
		int numberOfPlayers = 11;
		
        // Generate random heights for players
		int[] heights = generateHeights(minHeight, maxHeight, numberOfPlayers);
		
        // Print heights of all players
		for (int values : heights)
		{
		    System.out.println(values + " ");
		}

        // Find and print shortest height
        int shortestHeight = calculateShortestHeight(heights);
		System.out.println("Shortest height: " + shortestHeight);
		
        // Find and print tallest height
		int tallestHeight = calculateTallestHeight(heights);
		System.out.println("Tallest height: " + tallestHeight);
		
        // Calculate and print mean height
		double meanHeight = calculateMean(heights);
		System.out.println("Mean height: " + meanHeight);
	}
}
