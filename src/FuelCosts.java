import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tankGallons = 0;
        double mpg = 0;
        double gasPrice = 0;
        String invalid = "";
        boolean done = false;

        double costPerHundredMiles = 0;
        double currentDistance = 0;

        do {
            System.out.println("Enter the amount of gas the tank has: ");
            if(in.hasNextDouble())
            {
                tankGallons = in.nextDouble();
                in.nextLine();
                System.out.println("The tank has " + tankGallons + " gallons of gas right now.");
                done = true;
            }
            else
            {
                invalid = in.nextLine();
                System.out.println("Enter a valid input(Double)!");
            }
        }while(!done);

        done = false;

        do {
            System.out.println("Enter the gas mileage of the car: ");
            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                System.out.println("The car gets " + mpg + " miles per gallon.");
                done = true;
            }
            else
            {
                invalid = in.nextLine();
                System.out.println("Enter a valid input(Double)!");
            }
        }while(!done);

        done = false;

        do {
            System.out.println("Enter the price of gas per gallon: ");
            if(in.hasNextDouble())
            {
                gasPrice = in.nextDouble();
                in.nextLine();
                System.out.println("The price of gas is $" + gasPrice + " per gallon.");
                done = true;
            }
            else
            {
                invalid = in.nextLine();
                System.out.println("Enter a valid input(Double)!");
            }
        }while(!done);

        costPerHundredMiles = (100 * gasPrice) / mpg;
        currentDistance = tankGallons * mpg;

        System.out.println("The cost of gas for one hundred miles of traveling is $" + costPerHundredMiles + ".");
        System.out.println("The current distance you can travel with " + tankGallons + " gallons is " + currentDistance + " miles.");
    }
}
