import java.util.Scanner;

public class Assignment10 
{
    public static void main(String[] args)
    {
        //Registers
        double AX;
        double BX;
        double CX;
        double DX;

        Scanner in = new Scanner(System.in);

        System.out.println("This program is meant to help simulate adding registers in Assembly");
        System.out.println("Please enter double values when prompted");
        System.out.println();

        //Move values into registers
        System.out.print("AX = ");
        AX = in.nextDouble();
        System.out.print("BX = ");
        BX = in.nextDouble();
        System.out.print("CX = ");
        CX = in.nextDouble();
        System.out.print("DX = ");
        DX = in.nextDouble();

        System.out.println();
        System.out.println("Values for Added Registers");

        addRegisters(AX, BX, CX, DX);

        in.close();
    }

    //function to add the registers 
    //(In the book it says the third register is usually one of the original two, 
    //so I just made DX = DX + AX, because there is no EX)
    public static void addRegisters(double AX, double BX, double CX, double DX)
    {
        //store original values
        double AXVal = AX;
        double BXVal = BX;
        double CXVal = CX;
        double DXVal = DX;
        
        //final registers
        AX = AX + BXVal;
        BX = BX + CXVal;
        CX = CX + DXVal;
        DX = DX + AXVal;

        System.out.println("AX = " + AX);
        System.out.println("BX = " + BX);
        System.out.println("CX = " + CX);
        System.out.println("DX = " + DX);
    }
}
