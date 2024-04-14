import java.util.Scanner;

public class Assignment7 
{
    public static void main (String[] args)
    {
        boolean S;
        boolean R;
        boolean Q = true;
        boolean QBar = true;

        String Qchar;
        String QcharBar;

        try
        {
            Scanner in = new Scanner(System.in);

            System.out.println("This program is created to show an S-R Latch (Flip Flop)");
            System.out.println("\nPlease enter 'true/True' or 'false/False' for the inputs 'S' and 'R'");

                System.out.print("\nPlease enter true or false for S: ");
                S = in. nextBoolean();
                System.out.print("Please enter true or false for R: ");
                R = in.nextBoolean();

                if (S && !R) 
                {
                    Q = !(Q && QBar);
                    QBar = !(Q && QBar);
                    System.out.println("Q: " + Q);
                    System.out.println("QBar: " + QBar);
                } else if (!S && R) 
                {
                    Q = (Q && QBar);
                    QBar = !(Q && QBar);
                    System.out.println("Q: " + Q);
                    System.out.println("QBar: " + QBar);
                } else if (S && R == true) 
                {
                    Qchar = "Qsub0";
                    QcharBar = "Qsub0";
                    System.out.println("Q: " + Qchar);
                    System.out.println("QBar: " + QcharBar);
                } else 
                {
                    Qchar = "U";
                    QcharBar = "U";
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
