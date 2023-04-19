import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempInC = 0;
        double tempInF = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("Enter the temperature in Celsius: ");
            if(in.hasNextDouble())
            {
                tempInC = in.nextDouble();
                in.nextLine();
                System.out.println("The temperature is " + tempInC + " degrees Celsius.");
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Enter a valid input!");
            }
        }while(!done);

        tempInF = 32 + (9  * tempInC) / 5;

        System.out.println("That temperature is " + tempInF + "degrees Fahrenheit!");
    }
}
