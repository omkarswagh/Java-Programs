// Problem Statement : Accept value from user and Check number is Even or Odd.

import java.util.*;

class ToCheck
{
    public int iNo;

    public ToCheck(int A)
    {
        this.iNo = A;
    }

    public boolean checkEvenOdd()
    {
        if((this.iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the Numebr : ");
        iValue = sobj.nextInt();

        ToCheck tobj = new ToCheck(iValue);
        bRet = tobj.checkEvenOdd();

        if(bRet == true)
        {
            System.out.println(iValue+" : Number is Even");
        }
        else
        {
            System.out.println(iValue+" : Number is Odd");
        }

        sobj.close();
    }
}