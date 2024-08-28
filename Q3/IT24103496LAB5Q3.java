import java.util.Scanner;

public class IT24103496LAB5Q3 {

    static final int Room_charge_per_day = 48000;
    static final double discount_rate_1 = 0.0;
    static final double discount_rate_2 = 0.10;
    static final double discount_rate_3 = 0.20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Start date(day) : ");
        int Start_Date = scanner.nextInt();

        System.out.println("Enter the End date(day) : ");
        int End_Date = scanner.nextInt();

        if (Start_Date > End_Date) {
            System.out.println("Error. It's not valid.");
            return;
        }

        if (Start_Date < 1 || End_Date > 31) {
            System.out.println("Error. It's not valid.");
            return;
        }

        int No_of_reserved = End_Date - Start_Date + 1;

        // INPUT DISCOUNT RATES
        double discount_rate = 0.0;
        if (No_of_reserved >= 1 && No_of_reserved <= 3) {
            discount_rate = discount_rate_1;
        } else if (No_of_reserved >= 4 && No_of_reserved <= 5) {
            discount_rate = discount_rate_2;
        } else if (No_of_reserved > 5) {
            discount_rate = discount_rate_3;
        }

        double Total_Amount = No_of_reserved * Room_charge_per_day;
        double discount = Total_Amount * discount_rate;
        double Amount_To_Pay = Total_Amount - discount;

        System.out.println("Total Amount: " + Total_Amount);
        System.out.println("Discount: " + discount);
        System.out.println("Amount To Pay: " + Amount_To_Pay);
    }
}
