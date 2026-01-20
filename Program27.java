// Program that print Marvellous 5 times in screen

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

        for(iCnt = 1; iCnt <= iNo1; iCnt++)
        {
            System.out.println("Marvellous");
        }
        
    }
}

class Program27
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