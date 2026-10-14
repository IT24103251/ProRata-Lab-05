import java.util.Scanner;

public class IT24103251Lab5Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int members;

        System.out.print("Enter number of new members introduced : ");
        members = input.nextInt();

        // validation - must be 0 or greater
        if (members < 0)
        {
            System.out.println("Error : Number of members cannot be negative!");
        }
        else
        {
            switch (members)
            {
                case 0:
                    System.out.println("Prize : No Prize");
                    break;
                case 1:
                    System.out.println("Prize : Pen");
                    break;
                case 2:
                    System.out.println("Prize : Umbrella");
                    break;
                case 3:
                    System.out.println("Prize : Bag");
                    break;
                case 4:
                    System.out.println("Prize : Travelling Chair");
                    break;
                default:
                    System.out.println("Prize : Headphone");
            }
        }
    }
}