// Accept amount in US doollor and return its corresponding value in indian currency. consider 1$ as 70 Rupees.

//////////////////////////////////////////////////////////////////////////
//  
//  File Name :   Program61.java
//  Description : Accept amount in US doollor and return indian currency
//  Author :      Omkar Santosh Wagh
//  Date :        20/01/2026
//
//////////////////////////////////////////////////////////////////////////

import java.util.*;

class Convertor
{
    private int iNo;

    public Convertor(int A)
    {
        this.iNo = A;
    }

    public int dollorToINR()
    {
        int iCurrancy = 0, iRupee = 70;

            iCurrancy = iNo * iRupee;
            return iCurrancy;

    }
}

class Program61
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter the Value : ");
        iValue = sobj.nextInt();

        Convertor cobj = new Convertor(iValue);
        iRet = cobj.dollorToINR();

        System.out.println("Value in INR is : "+iRet);

        sobj.close();
    }
}