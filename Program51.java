//calculate the difference between the Sum of Factors and the Sum of Non-Factors

import java.util.*;

class FactorAnalyzer
{
    public int iNo;

    public FactorAnalyzer(int A)
    {
        this.iNo = A;
    }

    public int differenceFactorsNonFactors()
    {
        int iCnt = 0,iSumFactor = 0, iSumNonFactor = 0;

        if(iNo <= 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSumFactor = iSumFactor + iCnt;
            }
            else
            {
                iSumNonFactor = iSumNonFactor + iCnt;
            } 
        }
        return iSumNonFactor - iSumFactor;
    }
}

class Program51
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        FactorAnalyzer fobj = new FactorAnalyzer(iValue);
        iRet = fobj.differenceFactorsNonFactors();

        System.out.println("Difference of All Factor and Non Factors are : "+iRet);
        sobj.close();

    }
}