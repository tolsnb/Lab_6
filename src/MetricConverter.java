import java.util.Scanner;
public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        String invalid = "";
        boolean done = false;

        double inches = 0;
        double feet = 0;
        double miles = 0;

        do {
            System.out.println("Enter the measurement to be converted in meters: ");
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                System.out.println("The measurement to be converted is " + meters + " meters.");
                done = true;
            }
            else
            {
                invalid = in.nextLine();
                System.out.println("Enter a valid input!");
            }
        }while(!done);

        miles = meters / 1609;
        feet = miles * 5280;
        inches = feet * 12;

        System.out.println(meters + " meters is " + inches + " inches.");
        System.out.println(meters + " meters is " + feet + " feet.");
        System.out.println(meters + " meters is " + miles + " miles.");
    }
}
