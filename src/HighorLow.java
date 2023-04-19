import java.util.Scanner;
public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int guess = 0;
        String invalid = "";
        boolean done = false;

        do {
            int randNum = (int)Math.floor(Math.random() * (10 - 1 + 1) + 1);
            System.out.println("Try to guess the random integer!");
            if(in.hasNextInt())
            {
                guess = in.nextInt();
                in.nextLine();
                if(guess > randNum)
                {
                    System.out.println(guess + " is higher than " + randNum + ". Try again with a new number!");
                } else if (guess < randNum)
                {
                    System.out.println(guess + " is lower than " + randNum + ". Try again with a new number!");
                }
                else
                {
                    System.out.println("Your guess was right on the money! Nice job!");
                    done = true;
                }
            }
            else
            {
                invalid = in.nextLine();
                System.out.println("Enter a real integer!");
            }
        }while(!done);

    }
}
