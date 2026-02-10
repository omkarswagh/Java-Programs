// write a program which accept number from user and print all odd number till number.

import java.util.*;

class PrintNumber
{
    private int iNo;

    public PrintNumber(int A)
    {
        this.iNo = A;
    }

    public void printOdd()
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
}

class Program55
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : \n");
        iValue = sobj.nextInt();

        PrintNumber dobj = new PrintNumber(iValue);
        dobj.printOdd();
        sobj.close();
    }
}