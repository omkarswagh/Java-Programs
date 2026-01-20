// take number from user and print * on screen

import java.util.*;

class Printer
{
    public int iNo1;

    public Printer(int A)
    {
        this.iNo1 = A;
    }

    public void Display()
    {
        int iCnt = 0;

        if(iNo1 < 0)
        {
            iNo1 = -iNo1;
        }
        
        for(iCnt = 1; iCnt <= iNo1; iCnt++)
        {
            System.out.println("*");
        }
        
    }
}

class Program29
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Printer pobj = new Printer(iValue);
        pobj.Display();

        sobj.close();
    }
}