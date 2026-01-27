// Display Factors and sum of all factors

import java.util.*;

class Factor
{
    public int iNo;

    public Factor(int A)
    {
        this.iNo = A;
    }

    public int sumFactor()
    {
        int iCnt = 0, iSum = 0;

        System.out.println("Factors are : ");
        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}

class Program32
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Factor fobj = new Factor(iValue);
        iRet = fobj.sumFactor();

        System.out.println("Summ of all factors is : "+iRet);

        sobj.close();

    }
}