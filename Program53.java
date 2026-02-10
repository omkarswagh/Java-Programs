// write a program which accept number from user and print till that number.

import java.util.*;

class DisplayPattern
{
    private int iNo;

    public DisplayPattern(int A)
    {
        this.iNo = A;
    }

    public void patternNumber()
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}

class Program53
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : \n");
        iValue = sobj.nextInt();

        DisplayPattern dobj = new DisplayPattern(iValue);
        dobj.patternNumber();
        sobj.close();
    }
}