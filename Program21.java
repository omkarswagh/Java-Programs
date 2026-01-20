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

            for(iCnt = iNo; iCnt >= 1; iCnt--)
            {
                System.out.println(iCnt+"\n");
            }
        }
}

class Program21
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the Number that You Printf  in Reverse order on screen....");
        iValue = sobj.nextInt();

        Display dobj = new Display(iValue);
        dobj.display();

        sobj.close();

    }
}