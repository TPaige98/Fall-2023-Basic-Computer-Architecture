import java.util.Scanner;

public class Assignment1
{
    public static void main(String [] args)
    {
        try
        {
            System.out.println("Step 1: This is a calcuation for calculating the period of a periodic pulse train");
            System.out.println("Please enter the frequency, and the period will be provided");
            System.out.println();

            Scanner in = new Scanner(System.in);

            System.out.print("Enter Frequency: ");
            double freq = in.nextDouble();

            double period = 1 / freq;

            System.out.println();
            System.out.println("Period = " + period);
            
            System.out.println();
            System.out.println("Step 2: This is a calculation of the duty cycle for a periodic pulse train");
            System.out.println("Please enter the 'logic 1 pulse duration' and the 'period'");
            System.out.println();

            System.out.print("Enter 'logic 1 pulse duration': ");
            double log = in.nextDouble();

            System.out.print("Enter the period: ");
            double per = in.nextDouble();

            double duty = (log / per) * 1.00;

            System.out.println();
            System.out.println("Duty Cycle = " + duty);

            System.out.println();
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Step 3: This is a calculation that are repeating steps one and two");

            System.out.println();
            System.out.print("Enter Frequency: ");
            double freq2 = in.nextDouble();

            double period2 = 1 / freq2;

            System.out.println();
            System.out.println("Period = " + period2);

            System.out.println();
            System.out.print("Enter 'logic 1 pulse duration': ");
            double log2 = in.nextDouble();

            System.out.print("Enter the period: ");
            double per2 = in.nextDouble();

            System.out.println();
            double duty2 = (log2 / per2) * 1.00;
            System.out.println("Duty Cycle = " + duty2);
            in.close();
        }

        catch(Exception e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}
