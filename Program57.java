// Accept number from user and print small is number is less than 50 print small , less than 100 medium , greater than 100 print large
import java.util.*;

class ToCheck
{
    public int iNo;

   public ToCheck(int A)
    {
        this.iNo = A;
    }

   public void Display()
   {
        if(iNo < 50)
        {
            System.out.println("Small");
        }
        else if(iNo < 100)
        {
            System.out.println("Medium");
        }
        else if(iNo >= 100)
        {
            System.out.println("Large");
        }
   }
}

class Program57
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        ToCheck tobj = new ToCheck(iValue);
        tobj.Display();
        sobj.close();
    }
}