import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.printf("Quotient: %.2f%n", quotient);
        } else {
            System.out.println("Division is undefined for a zero divisor.");
        }

        input.close();
    }
}
