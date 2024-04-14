import java.util.Scanner;

public class Final 
{
    public static void main (String [] args)
    {
        boolean S;
        boolean R;
        boolean Q = true;
        boolean QNeg = true;

        String Qvar;
        String QvarNeg;

        try
        {
            Scanner in = new Scanner(System.in);
            
            System.out.println("This program is designed to show an S-R Latch Diagram");
            System.out.println();
            System.out.println("Please enter 'true/True' or 'false/False' for the inputs 'S' and 'R'");

            System.out.println();
            System.out.print("Please enter true or false for S: ");
            S = in.nextBoolean();

            System.out.print("Please enter true or false for R: ");
            R = in.nextBoolean();

            if (!S && R)
            {
                Q = (Q && QNeg);
                QNeg = !(Q && QNeg);
                System.out.println("Q: " + Q);
                System.out.println("Q Negated: " + QNeg);
            }
            else if (S && !R)
            {
                Q = !(Q && QNeg);
                QNeg = !(Q && QNeg);
                System.out.println("Q: " + Q);
                System.out.println("Q Negated: " + QNeg);
            }
            else if (S && R)
            {
                Qvar = "Q0";
                QvarNeg = "QNeg0";
                System.out.println("Q: " + Qvar);
                System.out.println("Q Negated: " + QvarNeg);
            }
            else
            {
                Qvar = "U";
                QvarNeg = "U";
                System.out.println("Q: " + Qvar);
                System.out.println("Q Negated: " + QvarNeg);
            }

            in.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}
