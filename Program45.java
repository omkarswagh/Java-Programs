// Accept one number from user and print that number of even number on screen.

import java.util.*;

class DisplayEven
{
    public int iNo;

    public DisplayEven(int A)
    {
        this.iNo = A;
    }

    public void evenNumber()
    {
        int iCnt = 0;

        if(iNo <= 0)
        {
            return;
        }

        for(iCnt = 1; iCnt <= iNo * 2; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program45
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DisplayEven dobj = new DisplayEven(iValue);
        dobj.evenNumber();
        sobj.close();
    }
}