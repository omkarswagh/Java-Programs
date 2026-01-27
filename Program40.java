// Display only even factor

import java.util.*;

class DisplayFactorseven
{
    public int iNo;

    public DisplayFactorseven(int A)
    {
        this.iNo = A;
    }

    public void evenFactor()
    {
        int iCnt = 0;

        if(this.iNo < 0)
        {
            this.iNo = -this.iNo;
        }

        if((this.iNo % 2) != 0)
        {
            return;
        }

        System.out.println("Even Factors Are : ");
        for(iCnt = 2; iCnt <= this.iNo/2; iCnt++)
        {
            if(((this.iNo % iCnt) == 0) && (iCnt % 2) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program40
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DisplayFactorseven dobj = new DisplayFactorseven(iValue);
        dobj.evenFactor();
        sobj.close();

    }
}