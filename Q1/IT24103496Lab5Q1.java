import java.util.Scanner;

public class IT24103496Lab5Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second integer:");
        int number2 = scanner.nextInt();
        System.out.println("Enter third integer:");
        int number3 = scanner.nextInt();

        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}
