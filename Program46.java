// Accept one number from user and print even factors of number on screen.

import java.util.*;

class DisplayEven
{
    public int iNo;

    public DisplayEven(int A)
    {
        this.iNo = A;
    }

    public void evenFactor()
    {
        int iCnt = 0;

        if(iNo <= 0)
        {
            return;
        }

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(((iNo % iCnt) == 0) && (iCnt % 2) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program46
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DisplayEven dobj = new DisplayEven(iValue);
        dobj.evenFactor();
        sobj.close();
    }
}