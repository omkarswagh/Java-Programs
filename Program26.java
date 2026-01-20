// Program to divide two numbers

import java.util.*;

class Arithematic
{
    public int iNo1;
    public int iNo2;

    public Arithematic(int A, int B)
    {
        this.iNo1 = A;
        this.iNo2 = B;
    }

    public int Division()
    {
        int iDiv = 0;

        if(iNo2 == 0)
        {
            return -1;
        }

        iDiv = this.iNo1 / this.iNo2;
        return iDiv;
    }
}

class Program26
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0, iRet = 0;

        System.out.println("Enter the First Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Second Number : ");
        iValue2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(iValue1,iValue2);
        iRet = aobj.Division();

        System.out.println("Division is : "+iRet);
        sobj.close();
    }
}