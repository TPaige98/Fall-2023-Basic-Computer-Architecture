

public class in_class_work_8_28 
{
    public static void main(String [] args)
    {
        try
        {
            byte aByte = (byte)0b10011010;
            System.out.println("byte: " + (aByte & 0xFF));
            //note: must bitwise AND & with hex 0xFF to get unsigned binary like in our homework
            String binary_number = Integer.toBinaryString(145);
            System.out.println("binary number of 145 = " + binary_number);
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
