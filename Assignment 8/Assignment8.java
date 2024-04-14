import java.util.Scanner;

public class Assignment8 
{
    public static void main(String [] args)
    {
        try 
        {
            Scanner in = new Scanner(System.in);

            int[] presA = {0, 0, 0, 0, 1, 1, 1, 1};
            int[] presB = {0, 0, 1, 1, 0, 0, 1, 1};
            int[] inputX = {0, 1, 0, 1, 0, 1, 0, 1};
            int[] nextA = {0, 0, 0, 1, 1, 1, 1, 0};
            int[] stateB = {0, 1, 1, 0, 0, 1, 1, 0};
            String[] FlipJ1 = {"0", "0", "0", "1", "X", "X", "X", "X"};
            String[] FlipK1 = {"X", "X", "X", "X", "0", "0", "0", "1"};
            String[] FlipJ2 = {"0", "1", "X", "X", "0", "1", "X", "X"};
            String[] FlipK2 = {"X", "X", "0", "1", "X", "X", "0", "1"};

            int length = 8;

            System.out.println("This program shows an Excitation Table for a 2-Bit Counter\n");
            System.out.println("The Complete Excitation Table is shown here:");

            System.out.println("------------------------------------------------------------------------");
            System.out.println("| Present | State | Input | Next | State | Flip | Flop |     Inputs    |");
            System.out.println("| A       | B     | X     | A    | B     | J1   | K1   | J2    | K2    |");
            System.out.println("------------------------------------------------------------------------");

            for (int i = 0; i < length; i++)
            {
                System.out.printf("| %d       | %d     | %d     | %d    | %d     | %s    | %s    | %s     | %s     |\n", presA[i], presB[i], inputX[i], nextA[i], stateB[i], FlipJ1[i], FlipK1[i], FlipJ2[i], FlipK2[i]);
            }
            System.out.println("------------------------------------------------------------------------");

            int presAin;
            int presBin;
            int inputXin;
            int nextAresult;
            int stateBresult;

            System.out.println("\n\nI created this part to allow for input and get answers from the Excitation Table for Present States, Input, and Next States");
            System.out.println("Please enter a combination of '0' and '1' for Present A, Present B, and Input X (Ex. PresA = 0, PresB = 1, InputX = 0): ");

            System.out.print("Present A = ");
            presAin = in.nextInt();
            System.out.print("Present B = ");
            presBin = in.nextInt();
            System.out.print("Input X = ");
            inputXin = in.nextInt();

            if ((presAin == 1 && presBin == 1 && inputXin == 1) || (presAin == 0 && presBin == 0 && inputXin == 0))
            {   
                nextAresult = 0;
                stateBresult = 0;
                System.out.println("\nNext A = " + nextAresult + "\n" + "State B = " + stateBresult);
            }
            if ((presAin == 0 && presBin == 0 && inputXin == 1) || (presAin == 0 && presBin == 1 && inputXin == 0))
            {
                nextAresult = 0;
                stateBresult = 1;
                System.out.println("\nNext A = " + nextAresult + "\n" + "State B = " + stateBresult);
            }
            if ((presAin == 0 && presBin == 1 && inputXin == 1) || (presAin == 1 && presBin == 0 && inputXin == 0))
            {
                nextAresult = 1;
                stateBresult = 0;
                System.out.println("\nNext A = " + nextAresult + "\n" + "State B = " + stateBresult);
            }
            if ((presAin == 1 && presBin == 0 && inputXin == 1) || (presAin == 1 && presBin == 1 && inputXin == 0))
            {
                nextAresult = 1;
                stateBresult = 1;
                System.out.println("\nNext A = " + nextAresult + "\n" + "State B = " + stateBresult);
            }

            in.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}
