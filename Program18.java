import java.util.*;

class Display
{
        public int iNo;

        public Display(int A)
        {
            this.iNo = A;
        }

        public void display()
        {
            int iCnt = 0;

            if(iNo < 0)
            {
                iNo = -iNo;
            }

            for(iCnt = 1; iCnt <= iNo; iCnt++)
            {
                System.out.println("Jay Ganesh...");
            }
        }
}

class Program18
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the Number that times print Jay Ganesh on screen");
        iValue = sobj.nextInt();

        Display dobj = new Display(iValue);
        dobj.display();

        sobj.close();

    }
}