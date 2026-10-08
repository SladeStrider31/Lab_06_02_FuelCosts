import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {


        Scanner in = new Scanner(System.in);
        //Declarations
        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        double costPer100Miles = (100.0 / mpg) * pricePerGallon;
        double distance = gallons * mpg;
        String trash = "";

        System.out.println("Enter the number of gallons of gas in the tank: ");
        if (in.hasNextDouble())
        {
            gallons = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must have done something wrong. \nTry another response");
            System.exit(0);
        }
        System.out.println("How many miles per gallon?: ");
        if (in.hasNextDouble())
        {
            mpg = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must have done something wrong. \nTry another response");
            System.exit(0);
        }
        System.out.println("Enter the price of gas: ");
        if (in.hasNextDouble())
        {
            pricePerGallon = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must have done something wrong. \nTry another response");
            System.exit(0);
        }
        costPer100Miles = (100.0 / mpg) * pricePerGallon;

        distance = gallons * mpg;

        // Display results
        System.out.println("Cost per 100 miles: " + costPer100Miles);
        System.out.println("Distance the car can travel: " + distance);
    }
}
