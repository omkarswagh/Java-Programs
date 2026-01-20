// Accept one number from user and check it is divisible by 5 or not

import java.util.*;

class Checker
{
    public int iNo1;

    public Checker(int A)
    {
        this.iNo1 = A;
    }

    public boolean checkDivisible()
    {
        if((iNo1 % 5) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program30
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Checker cobj = new Checker(iValue);
        bRet = cobj.checkDivisible();

        if(bRet == true)
        {
            System.out.println(iValue+" is divisible by 5");
        }
        else
        {
            System.out.println(iValue+" is Not divisible by 5");
        }

        sobj.close();
    }
}