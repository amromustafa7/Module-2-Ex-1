import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a degree in Celsius
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();  // Read the Celsius degree as a double

        // Convert Celsius to Fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // Display the result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

        // Close the scanner to prevent resource leak
        input.close();
    }
}
