// Program Name : Spring Season Program
// Description  : Checks whether the given date falls in Spring season

public class SpringSeason
{
    // Method to check if given date falls in Spring season
    public static boolean isSpring(int month, int day)  
    {
        // Spring is from March 20 to June 20
	    return (month == 4) || (month == 5) || 
		       (month == 3 && day >= 20) || 
		       (month == 6 && day <= 20);	    
    }

    public static void main(String[] args)
    {
        // Read month and day from command line arguments
	    int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
		
        // Check and display result
		if (isSpring(month, day))
			System.out.println("Spring Season");
		else
			System.out.println("Not a Spring Season");
    }
}
