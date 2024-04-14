import java.util.Scanner;

public class Assignment9 
{
    public static void main(String[] args)
    {

        //STEPS
        //1. Program takes input for a24, a25, a26, and a27.
        //2. a26 and a27 will then be inverted.
        //3. The results are sent through a NAND gate.
        
        try
        {
            Scanner in = new Scanner(System.in);

            boolean a24;
            boolean a25;
            boolean a26;
            boolean a27;
            boolean and;
            boolean nand;

            System.out.println("This program is created to simulate a microchip select hardware involving a NAND gate");

            System.out.println();
            System.out.println("Please enter true/True or false/False when prompted.");


            System.out.print("a24 = ");
            a24 = in.nextBoolean();
            System.out.print("a25 = ");
            a25 = in.nextBoolean();
            System.out.print("a26 = ");
            a26 = in.nextBoolean();
            System.out.print("a27 = ");
            a27 = in.nextBoolean();

            if (!a26)
            {a26 = true;}
            else
            {a26 = false;}

            if (!a27)
            {a27 = true;}
            else
            {a27 = false;}

            if (a26 && a27 && a24 && a25)
            {and = true;} 
            else
            {and = false;}

            System.out.println();
            System.out.println("AND Gate Results (a26 & a27 inverted): ");
            System.out.println("a24 = " + a24);
            System.out.println("a25 = " + a25);
            System.out.println("a26 = " + a26);
            System.out.println("a27 = " + a27);

            System.out.println();
            System.out.print("AND Gate = " + and + " |||| ");

            if (and == true) 
            {nand = false;} 
            else 
            {nand = true;}

            System.out.println("NAND Gate = " + nand);

            if (nand == false) 
            {System.out.println("ENABLED: Circuit is Active Low");} 
            else 
            {System.out.println("DISABLED: Circuit is NOT Active Low");}

            in.close();
        }

        catch(Exception e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}
