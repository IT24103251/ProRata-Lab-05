import java.util.Scanner;

public class IT24103251Lab5Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        int smallest, largest;

        System.out.print("Enter first number  : ");
        num1 = input.nextInt();

        System.out.print("Enter second number : ");
        num2 = input.nextInt();

        System.out.print("Enter third number  : ");
        num3 = input.nextInt();

        // find the largest number
        if (num1 > num2 && num1 > num3)
        {
            largest = num1;
        }
        else if (num2 > num1 && num2 > num3)
        {
            largest = num2;
        }
        else
        {
            largest = num3;
        }

        // find the smallest number
        if (num1 < num2 && num1 < num3)
        {
            smallest = num1;
        }
        else if (num2 < num1 && num2 < num3)
        {
            smallest = num2;
        }
        else
        {
            smallest = num3;
        }

        System.out.println("Smallest number : " + smallest);
        System.out.println("Largest number  : " + largest);
    }
}