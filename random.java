import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Define the range for the random number
        int min = 10;
        int max = 100;

        // Generate a random integer within the specified range (inclusive)
        // nextInt(bound) generates a number from 0 (inclusive) to bound (exclusive)
        // So, nextInt(max - min + 1) generates a number from 0 to (max - min)
        // Adding 'min' shifts this range to 'min' to 'max'
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Print the generated random number
        System.out.println("Generated random number between " + min + " and " + max + ": " + randomNumber);
    }
}