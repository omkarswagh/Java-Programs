// Accept Number from user and count how many digits in that number.

import java.util.*;

class DigitPrinter
{
    public int iNo;

    public DigitPrinter(int A)
    {
        this.iNo = A;
    }

    public int countDigit()
    {
        int iCnt = 0;
        int iDigit = 0;

        while(iNo !=0)
        {
            iDigit = iNo % 10;
            iCnt++;
            iNo = iNo / 10;
        } 

        return iCnt;
    }

}

class Program38
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;
        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DigitPrinter dobj = new DigitPrinter(iValue);
        iRet = dobj.countDigit();

        System.out.println("Count of Digit is : "+iRet);

        sobj.close();
    }
}