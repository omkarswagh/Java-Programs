// Accept one number from user and print that number of star on screen.

import java.util.*;

class DisplayStar
{
    public int iNo;

    public DisplayStar(int A)
    {
        this.iNo = A;
    }

    public void printStar()
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("* ");
        }
    }
}

class Program42
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DisplayStar dobj = new DisplayStar(iValue);
        dobj.printStar();
        sobj.close();
    }
}