import java.util.Scanner;

public class StringsCharacters{

    public static char[] findCharacters(String string){
         char[] chars = new char[string.length()];
		 for(int i = 0; i<string.length(); i++)
		 {
		  chars[i] = string.charAt(i);
		 }          
		 return chars;	   
    }
	
	public static boolean compareCharArrays(char[] arr1, char[] arr2)
	{
	    if(arr1.length != arr2.length)
        {
                 return false;
        }
		for(int i = 0; i < arr1.length; i++)
		 {
		  if (arr1[i] != arr2[i])
		  {
			return false;
		  }
		 }
		 return true;
	}

    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter original String: ");
        String string = input.next();
		 
        char[] userChar = findCharacters(string);
        System.out.println("Enter character array: ");	
		
		for (char c : userChar)
		{
		    System.out.print(c + " ");
		}
		System.out.println(); 
		
        char[] builtinChar = string.toCharArray();
        System.out.println("Enter character using built in: ");	
		
		System.out.println();
		for (char c : builtinChar)
		{
		    System.out.print(c + " ");
		}

        boolean isEqual = compareCharArrays(userChar, builtinChar);
        
            System.out.println("are equal: "+ isEqual);
        
		input.close();
    }
}



