import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class Test1 
{
    public static void main(String[] args)
    {
        try
        {
            double pulseDur = 0.1;
            double period = 10.1;

            PrintWriter out = new PrintWriter("output.txt");


            out.println("This is a calculation of the duty cycle for a periodic pulse train");
            out.println("In this example we will use (0.1) for 'logic 1 pulse duration'");
            out.println("We will then use (10.1) for the Period(T) variable");

            double duty = (pulseDur / period) * 1.00;

            out.println();
            out.print("Duty Cycle = " + duty);

            out.close();

            File inputFile = new File("output.txt");
            Scanner in = new Scanner(inputFile);
            while (in.hasNextLine())
            {
                String answer = in.nextLine();
                System.out.println(answer);
            }
            in.close();
        }

        catch(IOException e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}
