// Write a program which accepts an integer from the user and returns its digits in reverse order.

import java.util.*;

class ReverseDigit
{
    public int iNo;

   public ReverseDigit(int A)
    {
        this.iNo = A;
    }

    public int reverse()
    {
        int iDigit = 0;
        int iRev = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iRev = (iRev * 10) +iDigit;
        }

        return iRev;
    }
}

class Program58
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        ReverseDigit robj = new ReverseDigit(iValue);
        iRet = robj.reverse();

        System.out.println("Revesre Digit is : "+iRet);
        sobj.close();
    }
}