+//SOURCES USED FOR STRING CONCAT: https://www.javatpoint.com/string-concatenation-in-java

import java.util.Scanner;

public class Assignment6 
{
    public static void main(String[] args)
    {
        String eightBit;
        String toggle = "";
        char eightBitTraversal;

        try
        {
            Scanner in = new Scanner(System.in);

            System.out.println("\nThis is a program that toggles all the bits in an eight-bit binary number");
            System.out.println("Example:    Entered Value = 01010101    Toggle Result = 10101010");

            System.out.println();

            System.out.print("Please enter an eight-bit binary number (e.g. 00001111): ");

            eightBit = in.nextLine();

            for (int i = 0; i < eightBit.length(); i++)
            {
                eightBitTraversal = eightBit.charAt(i);
            

                if (eightBitTraversal == '0')
                {
                    toggle = toggle + "1";
                }    
                else
                {
                    toggle = toggle + "0";
                }
            }

            System.out.println("Initial Entry: " + eightBit);
            System.out.println("Calculated Answer: " + toggle);

            in.close();
        }
        catch (Exception e)
        {
            System.out.println("error occurred: " + e);
        }
    }
}