// Find Maximum
import java.util.*;

class Calculation
{
    public int iNo1;
    public int iNo2;

    public Calculation(int A, int B)
    {
        this.iNo1 = A;
        this.iNo2 = B;
    }

    public int Maximum()
    {
        if(iNo1 > iNo2)
        {
            return iNo1;
        }
        else
        {
            return iNo2;
        }
    }
}

class Program10
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0, iRet = 0;

        System.out.println("Enter the Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iValue2 = sobj.nextInt();

        Calculation cobj = new Calculation(iValue1,iValue2);
        iRet = cobj.Maximum();

        System.out.println("Maximum number is : "+iRet);

        sobj.close();
    }
}