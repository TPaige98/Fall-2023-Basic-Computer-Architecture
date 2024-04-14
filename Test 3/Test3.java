import java.util.Scanner;

public class Test3 
{
    public static void main (String[] args)
    {
        boolean J;
        boolean K;
        boolean Q = true;
        boolean QBar = true;

        String Qchar;
        String QcharBar;

        try
        {
            Scanner in = new Scanner(System.in);

            System.out.println("This program is created to show an J-K Flip Flop");
            System.out.println("\nPlease enter 'true/True' or 'false/False' for the inputs 'J' and 'K'");

                System.out.print("\nPlease enter true or false for J: ");
                J = in. nextBoolean();
                System.out.print("Please enter true or false for K: ");
                K = in.nextBoolean();

                if (J && !K) 
                {
                    Q = (Q && QBar);
                    QBar = !(Q && QBar);
                    System.out.println("Q: " + Q);
                    System.out.println("QBar: " + QBar);
                } else if (!J && K) 
                {
                    Q = !(Q && QBar);
                    QBar = !(Q && QBar);
                    System.out.println("Q: " + Q);
                    System.out.println("QBar: " + QBar);
                } else if (J && K == true) 
                {
                    Qchar = "Q-Bar-Sub0";
                    QcharBar = "Q";
                    System.out.println("Q: " + Qchar);
                    System.out.println("QBar: " + QcharBar);
                } else 
                {
                    Qchar = "Q-Sub0";
                    QcharBar = "Q-Bar-Sub0";
                    System.out.println("Q: " + Qchar);
                    System.out.println("QBar: " + QcharBar);
                }

                in.close();

        }
        catch (Exception e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}
