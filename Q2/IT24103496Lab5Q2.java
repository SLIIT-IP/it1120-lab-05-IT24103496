import java.util.Scanner;

public class IT24103496LAB5Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int membersIntroduced = scanner.nextInt();

        // Validate the input (must be 0 or greater)
        if (membersIntroduced < 0) {
            System.out.println("Input must be a number 0 or greater");
        } else {
            // Determine the prize using a switch statement
            String prize;
            switch (membersIntroduced) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }

            // Display the prize
            System.out.println("Prize is: " + prize);
        }

        scanner.close();
    }
}
