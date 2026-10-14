import java.util.Scanner;

public class IT24103251Lab5Q3
{
    public static void main(String[] args)
    {
        // constants (fixed values)
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_RATE_10 = 10.0;   // 3 - 4 days
        final double DISCOUNT_RATE_20 = 20.0;   // 5 or more days

        Scanner input = new Scanner(System.in);

        int startDay, endDay, noOfDays;
        double totalAmount, discountRate, discount, amountToPay;

        System.out.print("Enter start date (day) : ");
        startDay = input.nextInt();

        System.out.print("Enter end date (day)   : ");
        endDay = input.nextInt();

        // Validation 1 - dates must be between 1 and 31
        if (startDay < 1 || startDay > 31 || endDay < 1 || endDay > 31)
        {
            System.out.println("Error : Dates must be between 1 and 31!");
            System.exit(0);
        }

        // Validation 2 - start date must be less than end date
        if (startDay >= endDay)
        {
            System.out.println("Error : Start date should be less than end date!");
            System.exit(0);
        }

        noOfDays = endDay - startDay;
        totalAmount = noOfDays * ROOM_CHARGE_PER_DAY;

        // find the discount rate
        if (noOfDays < 3)
        {
            discountRate = 0;
        }
        else if (noOfDays <= 4)        // 3 or 4 days
        {
            discountRate = DISCOUNT_RATE_10;
        }
        else                           // 5 or more days
        {
            discountRate = DISCOUNT_RATE_20;
        }

        discount = totalAmount * discountRate / 100.0;
        amountToPay = totalAmount - discount;

        System.out.println("Number of days reserved : " + noOfDays);
        System.out.printf("Total amount to be paid : Rs. %.2f%n", amountToPay);
    }
}