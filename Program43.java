// Accept one number from user and if number is less than 10 then print "Hello" otherwise print "Demo".

import java.util.*;

class Display
{
    public int iNo;

    public Display(int A)
    {
        this.iNo = A;
    }

    public void printer()
    {
        if(iNo < 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }
    }
}

class Program43
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Display dobj = new Display(iValue);
        dobj.printer();
        sobj.close();
    }
}