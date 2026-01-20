// Calculate Average of 3 number

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

    public float calculateAverage()
    {
        float fAvg = 0.0f;
        fAvg = ((float)(this.iNo1 + this.iNo2 + this.iNo3) / 3);
        return fAvg;
    }
}

class Program12
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iValue3 = 0;
        float fRet = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter third Number : ");
        iValue3 = sobj.nextInt();

        Calculate cobj = new Calculate(iValue1,iValue2,iValue3);
        fRet = cobj.calculateAverage();

        System.out.println("Average is : "+fRet);
        sobj.close();

    }
}