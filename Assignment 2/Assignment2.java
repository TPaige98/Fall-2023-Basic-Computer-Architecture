import java.util.Scanner;

public class Assignment2
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

            /*------------------------------------------------------------------------------------------------------------------------------------- */
            /* HOMEWORK 2 CODE */

            System.out.println();
            System.out.println("--------------------------- HOMEWORK 2 CODE --------------------------");
            System.out.println();

            System.out.println("--------------- Decimal to Binary Conversion ----------------");
            System.out.println();

            System.out.print("Please Enter a Decimal Integer: ");
            int dec_num = in.nextInt();

            String dec_to_bin = Integer.toBinaryString(dec_num);

            System.out.println("Binary Number: " + dec_to_bin);

            System.out.println();

            System.out.println("--------------- Binary to Hexadecimal Conversion ---------------");
            System.out.println();

            System.out.print("Please Enter a Binary Number: ");
            long bin_num = in.nextLong();

            long dec = Long.parseLong(String.valueOf(bin_num), 2);
            String hex = Long.toHexString(dec);
            String hexUpper = hex.toUpperCase();

            System.out.println("Hexadecimal Number: " + hexUpper);

            // I found on the Java Oracle docs the "parse" function.
            // That same page also contained the "toHexString" and the other functions that were necessary for this assignment.
            // https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
            
            in.close();
        }

        catch(Exception e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}