import java.util.Scanner;

public class Assignment4
{
    public static void main(String [] args)
    {

        boolean A, B;
        boolean A_AND_B, A_OR_B;
        boolean AandB_AND_AorB, AandB_OR_AorB;

        try
        {

            Scanner in = new Scanner(System.in);

            System.out.println("This is a logic gate circuit representation, please enter 'True' or 'False' for A and B");
            
            System.out.print("Enter True or False for A: ");
            A = in.nextBoolean();
            
            System.out.print("Enter True or False for B: ");
            B = in.nextBoolean();

            System.out.println();

            /*A and B Logic*/
            if (A && B) 
            {A_AND_B = true;}
            else 
            {A_AND_B = false;}

            /*A or B Logic*/
            if (A || B)
            {A_OR_B = true;}
            else
            {A_OR_B = false;}

            /*A and B AND A or B Logic*/
            if((A && B) && (A || B))
            {AandB_AND_AorB = true;}
            else
            {AandB_AND_AorB = false;}

            /*A and B OR A or B Logic*/
            if((A && B) || (A || B))
            {AandB_OR_AorB = true;}
            else
            {AandB_OR_AorB = false;}

            System.out.println("A and B = " + A_AND_B + "\nA or B = " + A_OR_B + "\n(A and B) AND (A or B) = " 
            + AandB_AND_AorB + "\n(A and B) OR (A or B) = " + AandB_OR_AorB);
            
            in.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}
