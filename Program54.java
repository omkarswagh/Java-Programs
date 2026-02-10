// write a program which accept number from user and print numberline of that number.

import java.util.*;

class DisplayPattern
{
    private int iNo;

    public DisplayPattern(int A)
    {
        this.iNo = A;
    }

    public void numberLine()
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        for(iCnt = -iNo; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
    }
}

class Program54
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : \n");
        iValue = sobj.nextInt();

        DisplayPattern dobj = new DisplayPattern(iValue);
        dobj.numberLine();
        sobj.close();
    }
}