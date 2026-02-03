// Display only even Digit

import java.util.*;

class DisplayDigit
{
    public int iNo;

    public DisplayDigit(int A)
    {
        this.iNo = A;
    }

    public void evenDigit()
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        System.out.println("Even Digit Are : ");
            while(iNo != 0)
            {
                iDigit = iNo % 10;
                if((iDigit % 2) == 0)
                {
                    System.out.println(iDigit);
                }
                iNo = iNo / 10;
            }
    }
}

class Program41
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DisplayDigit dobj = new DisplayDigit(iValue);
        dobj.evenDigit();
        sobj.close();

    }
}