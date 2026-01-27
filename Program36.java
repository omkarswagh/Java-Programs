/*
    Write a  program that accepts an integer number and displays each digit of the number separately
    For example, if the input number is 721, the program should display each digit (1, 2, and 7) 
*/ 
import java.util.*;

class DigitPrinter
{
    public int iNo;

    public DigitPrinter(int A)
    {
        this.iNo = A;
    }

    public void displayDigit()
    {
        int iCnt = 0;
        int iDigit = 0;

        while(iNo !=0)
        {
            System.out.println("Value of No is : "+iNo);
            iDigit = iNo % 10;
            System.out.println("Digit is : "+iDigit);
            iNo = iNo / 10;
            System.out.println("Value of iNo is : "+iNo);
        } 
    }
}

class Program36
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DigitPrinter dobj = new DigitPrinter(iValue);
        dobj.displayDigit();
        sobj.close();
    }
}