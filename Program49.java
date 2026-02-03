// Accept one number from user and display all non Factors

import java.util.*;

class DisplayFactor
{
    public int iNo;

    public DisplayFactor(int A)
    {
        this.iNo = A;
    }

    public void nonfactor()
    {
        int iCnt = 0;

        if(iNo <= 0)
        {
            iNo = -iNo ;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program49
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DisplayFactor dobj = new DisplayFactor(iValue);
        dobj.nonfactor();
        sobj.close();
    }
}