// Check number is pallindrome or not

import java.util.*;

class NumberChecker
{
    private int iNo;

    public NumberChecker(int A)
    {
        this.iNo = A;
    }

    public boolean checkPallindrome()
    {
        int iDigit = 0, iCopy = iNo, iRev = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }
        return(iRev == iCopy);
    }
}

class Program59
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        NumberChecker nobj = new NumberChecker(iValue);
        bRet = nobj.checkPallindrome();
        
        if(bRet == true)
        {
            System.out.println(iValue+" is Pallindrome Number");
        }
        else
        {
        System.out.println(iValue+" is Not Pallindrome Number"); 
        }

        sobj.close();

    }
}