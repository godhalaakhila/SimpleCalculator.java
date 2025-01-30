public class SimpleCalculator {
    public static void main(String[] args) {
        // Hardcoded values for the two numbers
        double num1 = 10.0;
        double num2 = 5.0;

        // Perform and display the results
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        
        // Handle division with a check for division by zero
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
 
    

