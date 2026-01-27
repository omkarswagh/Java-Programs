// Problem Statement : Accept 2 values from user and perform the addition.

import java.util.*;

class Arithematic
{
    public int iNo1;
    public int iNo2;

    public Arithematic(int A, int B)
    {
        iNo1 = A;
        iNo2 = B;
    }

    public int Addition()
    {
        int iSum = iNo1 + iNo2;
        return iSum;
    }
    
}

class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0, iRet = 0;

        System.out.println("Enter First Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iValue2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(iValue1,iValue2);
        iRet = aobj.Addition();

        System.out.println("Addition is : "+iRet);

        sobj.close();

    }
}