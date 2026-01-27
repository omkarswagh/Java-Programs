// Accept Number from user and addition of digits
// Input : 7521
// Output : 15

import java.util.*;

class DigitPrinter
{
    public int iNo;

    public DigitPrinter(int A)
    {
        this.iNo = A;
    }

    public int sumDigit()
    {
        int iSum = 0;
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = - iNo;
        }

        while(iNo !=0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        } 

        return iSum;
    }

}

class Program39
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;
        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DigitPrinter dobj = new DigitPrinter(iValue);
        iRet = dobj.sumDigit();

        System.out.println("Sum of Digit is : "+iRet);

        sobj.close();
    }
}