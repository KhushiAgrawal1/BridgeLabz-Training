// Program to generate 4-digit random numbers and find average, minimum and maximum

public class RandomNumberStatistics {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] randomNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random 4-digit number between 1000 and 9999
            randomNumbers[i] = (int)(Math.random() * 9000) + 1000;
        }

        return randomNumbers;
    }

    // Method to find average, minimum and maximum
    // Returns array where:
    // index 0 -> average
    // index 1 -> minimum
    // index 2 -> maximum
    public static double[] findAverageMinMax(int[] numbers) {

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {

            sum += number;

            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = (double) sum / numbers.length;

        return new double[] {average, min, max};
    }

    public static void main(String[] args) {

        int arraySize = 5;

        // Generate random numbers
        int[] randomNumbers = generate4DigitRandomArray(arraySize);

        // Display generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        // Find average, min and max
        double[] results = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("Average Value: " + results[0]);
        System.out.println("Minimum Value: " + (int) results[1]);
        System.out.println("Maximum Value: " + (int) results[2]);
    }
}
