// write a program which accept number from user and print First 5 multiple of that number.
// input : 4  output : 4   8  12  16  20

import java.util.*;

class PrintNumber
{
    private int iNo;

    public PrintNumber(int A)
    {
        this.iNo = A;
    }

    public void printMultiple()
    {
        int iCnt = 0, iSum = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            iSum = iCnt * iNo;
            System.out.print(iSum+"\t");
        }
    }
}

class Program56
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : \n");
        iValue = sobj.nextInt();

        PrintNumber dobj = new PrintNumber(iValue);
        dobj.printMultiple();
        sobj.close();
    }
}