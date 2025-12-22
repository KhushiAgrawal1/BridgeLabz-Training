import java.util.Scanner;

public class NumberChecker
{
    // Method to find count of digits in a number
    public static int countDigits(int number)
    {
        int count = 0;

        while (number != 0)
        {
            count++;
            number = number / 10;
        }
        return count;
    }

    // Method to store digits of the number in an array
    public static int[] getDigitsArray(int number)
    {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--)
        {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // Method to check if the number is a Duck Number
    // Duck number: number that contains at least one non-zero digit
    public static boolean isDuckNumber(int[] digits)
    {
        for (int digit : digits)
        {
            if (digit != 0)
            {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits)
    {
        int power = digits.length;
        int sum = 0;

        for (int digit : digits)
        {
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits)
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits)
        {
            if (digit > largest)
            {
                secondLargest = largest;
                largest = digit;
            }
            else if (digit > secondLargest && digit != largest)
            {
                secondLargest = digit;
            }
        }
        return new int[] { largest, secondLargest };
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits)
    {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits)
        {
            if (digit < smallest)
            {
                secondSmallest = smallest;
                smallest = digit;
            }
            else if (digit < secondSmallest && digit != smallest)
            {
                secondSmallest = digit;
            }
        }
        return new int[] { smallest, secondSmallest };
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int digitCount = countDigits(number);
        int[] digitsArray = getDigitsArray(number);

        System.out.println("Count of digits: " + digitCount);

        System.out.print("Digits Array: ");
        for (int digit : digitsArray)
        {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number: " + isDuckNumber(digitsArray));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digitsArray));

        int[] largestValues = findLargestAndSecondLargest(digitsArray);
        System.out.println("Largest Digit: " + largestValues[0]);
        System.out.println("Second Largest Digit: " + largestValues[1]);

        int[] smallestValues = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("Smallest Digit: " + smallestValues[0]);
        System.out.println("Second Smallest Digit: " + smallestValues[1]);
    }
}
