import java.util.Scanner;

public class Assignment5
{
    public static void main(String[] args)
    {
        boolean A;
        boolean B;
        boolean Cin;
        int Cout_Binary = 0;
        int Sum_Binary = 0;

        try
        {
            Scanner in = new Scanner(System.in);

            System.out.println("THIS IS A REPRESENTATION OF A FULL ADDER\n");
            System.out.println("PLEASE ENTER True/true OR False/false WHEN PROMPTED");

            System.out.print("Enter True or False for A: ");
            A = in.nextBoolean();

            System.out.print("Enter True or False for B: ");
            B = in.nextBoolean();

            System.out.print("Enter True or False for C: ");
            Cin = in.nextBoolean();

            System.out.println();

            boolean Cout = ((B && Cin) || (A && B) || (A && Cin));
            boolean Sum = ((!A && !B && Cin) || (!A && B && !Cin) || (A && B && Cin) || (A && !B && !Cin));

            System.out.println("Carryout = " + Cout);
            System.out.println("Sum = " + Sum);

            /*------------------END OF ASSIGNMENT INSTRUCTIONS------------------*/

            //I wanted to setup the full adder to also output the true/false as a "1" or "0" for binary notation, so I set that up as well. 
            if (Cout == true) 
            {Cout_Binary = 1;}
            else
            {Cout_Binary = 0;}

            if (Sum == true) 
            {Sum_Binary = 1;}
            else 
            {Sum_Binary = 0;}

            System.out.println();
            System.out.println("Carryout in Binary = " + Cout_Binary);
            System.out.println("Sum in Binary = " + Sum_Binary);
            
            in.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}
