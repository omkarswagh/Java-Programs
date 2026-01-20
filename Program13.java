// Find Maximum from 3 number 

import java.util.*;

class Calculate
{
    public int iNo1;
    public int iNo2;
    public int iNo3;

    public Calculate(int A, int B, int C)
    {
        this.iNo1 = A;
        this.iNo2 = B;
        this.iNo3 = C;
    }

    public int Maximum()
    {
        if(iNo1 >= iNo2 && iNo1 >= iNo3)
        {
            return iNo1;
        }
        else if(iNo2 >= iNo1 && iNo2 >= iNo3)
        {
            return iNo2;
        }
        else
        {
            return iNo3;
        }
    }
}

class Program13
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iValue3 = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter third Number : ");
        iValue3 = sobj.nextInt();

        Calculate cobj = new Calculate(iValue1,iValue2,iValue3);
        iRet = cobj.Maximum();

        System.out.println("Maximum number is : "+iRet);
        sobj.close();

    }
}