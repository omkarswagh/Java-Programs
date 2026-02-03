// Accept one number from user and return sumation of all non Factors

import java.util.*;

class Factors
{
    public int iNo;

    public Factors(int A)
    {
        this.iNo = A;
    }

    public int summationNonFactors()
    {
        int iCnt = 0, iSum = 0;

        if(iNo <= 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;
            } 
        }
        return iSum;
    }
}

class Program50
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Factors fobj = new Factors(iValue);
        iRet = fobj.summationNonFactors();

        System.out.println("Summation of All Non Factors are : "+iRet);
        sobj.close();

    }
}