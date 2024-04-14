import java.util.Scanner;

public class Test2Work 
{
    public static void main(String[] args)
    {
        boolean A1, B1;
        boolean A1_AND_B1, A1_OR_B1;
        boolean A1orB1_AND_A1andB1, A1orB1_OR_A1orB1;

        boolean A2;
        boolean B2;
        boolean Cin2;

        try
        {
            Scanner in = new Scanner(System.in);

            //--------------------------TEST 1----------------------------//

            System.out.println("TEST #1: THIS IS A LOGIC GATE REPRESENTATION\n");

            System.out.print("Enter True or False for A: ");
            A1 = in.nextBoolean();
            System.out.print("Enter True or False for B: ");
            B1 = in.nextBoolean();

            System.out.println();

            /*A and B Logic*/
            if (A1 && B1) 
            {A1_AND_B1 = true;}
            else 
            {A1_AND_B1 = false;}

            /*A or B Logic*/
            if (A1 || B1)
            {A1_OR_B1 = true;}
            else
            {A1_OR_B1 = false;}

            /*A or B AND A and B Logic*/
            if((A1 || B1) && (A1 && B1))
            {A1orB1_AND_A1andB1 = true;}
            else
            {A1orB1_AND_A1andB1 = false;}

            /*A or B OR A or B Logic*/
            if((A1 || B1) || (A1 || B1))
            {A1orB1_OR_A1orB1 = true;}
            else
            {A1orB1_OR_A1orB1 = false;}

            System.out.println("A and B = " + A1_AND_B1 + "\nA or B = " + A1_OR_B1 + 
            "\n(A or B) AND (A and B) = " + A1orB1_AND_A1andB1 +
             "\n(A or B) OR (A or B) = " + A1orB1_OR_A1orB1);

            //--------------------------TEST 2----------------------------//

            System.out.println("\nTEST #2: THIS IS A REPRESENTATION OF AN ADDER\n");
            System.out.println("PLEASE ENTER True/true OR False/false WHEN PROMPTED");

            System.out.print("Enter True or False for A: ");
            A2 = in.nextBoolean();
            System.out.print("Enter True or False for B: ");
            B2 = in.nextBoolean();
            System.out.print("Enter True or False for C: ");
            Cin2 = in.nextBoolean();

            System.out.println();

            boolean Sum = ((!A2 && B2 && !Cin2) || (A2 && B2 && Cin2) || (A2 && !B2 && !Cin2));

            System.out.println("Sum = " + Sum);

            in.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}
