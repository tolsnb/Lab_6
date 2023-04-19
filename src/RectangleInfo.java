import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double length = 0;
        double width = 0;
        String invalid = "";

        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        boolean done = false;

        do {
            System.out.println("Enter the length of the rectangle: ");
            if(in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                System.out.println("The length of the rectangle is " + length + ".");
                done = true;
            }
            else
            {
                invalid = in.nextLine();
                System.out.println("Enter a valid input(double)!");
            }
        }while(!done);

        done = false;

        do {
            System.out.println("Enter the width of the rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                System.out.println("The width of the rectangle is " + width + ".");
                done = true;
            }
            else
            {
                invalid = in.nextLine();
                System.out.println("Enter a valid input(double)!");
            }
        }while(!done);

        area = length * width;
        perimeter = 2 * length + 2 * width;
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width,2));

        System.out.println("The area of the rectangle is " + area + ".");
        System.out.println("The perimeter of the rectangle is " + perimeter + ".");
        System.out.println("The diagonal of the rectangle is " + diagonal + ".");
    }
}
