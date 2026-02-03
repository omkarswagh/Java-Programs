// Accept one number from user and print multiplication of factors

import java.util.*;

class DisplayFactorMultiplication
{
    public int iNo;

    public DisplayFactorMultiplication(int A)
    {
        this.iNo = A;
    }

    public long factorMultiplication()
    {
        int iCnt = 0;
        long lMulti = 1;

        if(iNo <= 0)
        {
            return -1;
        }

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                lMulti = lMulti * iCnt;
            }
        }
        return lMulti;
    }
}

class Program47
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        long lRet = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DisplayFactorMultiplication dobj = new DisplayFactorMultiplication(iValue);
        lRet = dobj.factorMultiplication();

        System.out.println("Factor Multiplication is : "+lRet);

        sobj.close();
    }
}