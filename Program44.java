// Accept two number from user and display first number in second number of time.

import java.util.*;

class Display
{
    public int iNo1;
    public int iNo2;

    public Display(int A, int B)
    {
        this.iNo1 = A;
        this.iNo2 = B;
    }

    public void printer()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo2; iCnt++)
        {
            System.out.println(+iNo1);
        }
    }
}

class Program44
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;
        System.out.println("Enter First Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iValue2 = sobj.nextInt();

        Display dobj = new Display(iValue1, iValue2);
        dobj.printer();
        sobj.close();
    }
}