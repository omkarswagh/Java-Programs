// Accept Number from user and Check wheather number is perfect number or not.

import java.util.*;

class Factor
{
    public int iNo;

    public Factor(int A)
    {
        this.iNo = A;
    }

    public boolean checkPerfect()
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

            if(iSum == this.iNo)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
}

class Program33
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Factor fobj = new Factor(iValue);
        bRet = fobj.checkPerfect();

        if(bRet == true)
        {
            System.out.println(iValue+" is Perfect Number");
        }
        else
        {
           System.out.println(iValue+" is Not Perfect Number"); 
        }
        sobj.close();
    }
}