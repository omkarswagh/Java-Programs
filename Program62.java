// write a program to find Odd factorial of given number.

//////////////////////////////////////////////////////////////////////////
//  
//  File Name :   Program63.java
//  Description : program to find odd factorial of given number
//  Author :      Omkar Santosh Wagh
//  Date :        22/01/2026
//
//////////////////////////////////////////////////////////////////////////

import java.util.*;

class Factorial 
{
    private int iNo;

    public Factorial(int X)
    {
        this.iNo = X;
    }

    public int oddFactorial()
    {
        int iCnt = 0, iMulti = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                iMulti = iMulti * iCnt;
            }
        }
        return iMulti;
    }
}

class Program62
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Factorial fobj = new Factorial(iValue);
        iRet = fobj.oddFactorial();

        System.out.println("Odd Factoria is : "+iRet);

        sobj.close();
    }
}