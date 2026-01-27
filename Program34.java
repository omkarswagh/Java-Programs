// Accept Number from user and Check wheather number is Prime number or not.

import java.util.*;

class PrimeNumberChecker
{
    public int iNo;

    public PrimeNumberChecker(int A)
    {
        this.iNo = A;
    }

    public boolean checkPrime()
    {
        int iCnt = 0;

        if(this.iNo <= 0)
        {
            this.iNo = - this.iNo;
        }

        for(iCnt = 2; iCnt <= iNo/2; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                return false;
            }
        }
        return true;
    }
}

class Program34
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        PrimeNumberChecker pobj = new PrimeNumberChecker(iValue);
        bRet = pobj.checkPrime();

        if(bRet == true)
        {
            System.out.println(iValue+" is Prime Number");
        }
        else
        {
           System.out.println(iValue+" is Not Prime Number"); 
        }
        sobj.close();
    }
}