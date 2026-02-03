// Accept one number from user and display factors in Decreasing order

import java.util.*;

class DisplayFactor
{
    public int iNo;

    public DisplayFactor(int A)
    {
        this.iNo = A;
    }

    public void factorDecreasingOrder()
    {
        int iCnt = 0;

        if(iNo <= 0)
        {
            iNo = -iNo ;
        }

        for(iCnt = iNo/2; iCnt >= 1; iCnt--)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program48
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DisplayFactor dobj = new DisplayFactor(iValue);
        dobj.factorDecreasingOrder();
        sobj.close();
    }
}