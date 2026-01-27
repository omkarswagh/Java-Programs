// Display Factors

import java.util.*;

class Factor
{
    public int iNo;

    public Factor(int A)
    {
        this.iNo = A;
    }

    public void displayFactor()
    {
        int iCnt = 0;

        System.out.println("Factors are : ");
        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program31
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Factor aobj = new Factor(iValue);
        aobj.displayFactor();

        sobj.close();

    }
}