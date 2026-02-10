// display below pattern 
// * * * * * # # # # # 

import java.util.*;

class Pattern
{
    private int iNo;

    public Pattern(int A)
    {
        this.iNo = A;
    }

    public void patterDisplay()
    {
        int iCnt1 = 0, iCnt2 = 0;

    for(iCnt1 = 1; iCnt1 <= iNo; iCnt1++)
    {
        System.out.print("*\t");
    }

    for(iCnt2 = 1; iCnt2 <= iNo; iCnt2++)
    {
        System.out.print("#\t");
    }
    }
}

class Program60
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Value : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern(iValue);
        pobj.patterDisplay();

        sobj.close();
    }
}