public class ParkingLotGateSystem
{
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int capacity = 5;
		int parkedCars = 0;
		int choice;
		
		while(true)
		{
			if(parkedCars == capacity)
			{
				System.out.println("Parking is full");
				break;
			}
			
				System.out.println("\n---Parking Menu---");
				System.out.println("1. Park Vehicle ");
				System.out.println("2. Exit Vehicle ");
				System.out.println("3. Show Occupancy ");
				System.out.println("4. Exit System ");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				
				switch(choice)
				{
					case 1:
						parkedCars++;
						System.out.println("Vehicle Parked");
						break;
					case 2:
						if(parkedCars>0)
						{
							parkedCars--;
							System.out.println("Vehicle Exited");
						}
						else{
							System.out.println("No vehicle present");
						}
						break;
					case 3:
						System.out.println("Occupancy: " + parkedCars);
						System.out.println("Remaining: " + (capacity-parkedCars));
						break;
					case 4:
						System.out.println("Exit...");
						sc.close();
						return;
						
						default:
							System.out.println("Invalid Choice");
				}				
				
		}
		sc.close();
	}
	
}