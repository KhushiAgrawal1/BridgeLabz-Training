// Program Name : OTP Generator and Uniqueness Checker
// Description  : This program generates a six-digit OTP number using the
//                Math.random() method. It generates the OTP 10 times, stores
//                them in an array, and checks whether all generated OTPs
//                are unique using static utility methods.

public class OTPGenerator
{
    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP()
    {
        // Generates numbers from 100000 to 999999
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps)
    {
        for (int i = 0; i < otps.length; i++)
        {
            for (int j = i + 1; j < otps.length; j++)
            {
                if (otps[i] == otps[j])
                {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All OTPs are unique
    }

    // Main method
    public static void main(String[] args)
    {
        int[] otpArray = new int[10];

        // Generate OTPs and store in array
        for (int i = 0; i < otpArray.length; i++)
        {
            otpArray[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray)
        {
            System.out.println(otp);
        }

        // Check uniqueness
        boolean isUnique = areOTPsUnique(otpArray);

        if (isUnique)
        {
            System.out.println("All generated OTPs are unique.");
        }
        else
        {
            System.out.println("Generated OTPs are NOT unique.");
        }
    }
}
