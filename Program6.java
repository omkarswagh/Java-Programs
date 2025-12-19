// Problem Statement : Calculate Percentage
import java.util.*;

class Calculate
{
    public float fMarks;
    public int iTotal;

    public Calculate(float A, int B)
    {
        this.fMarks = A;
        this.iTotal = B;
    }

    public float calculatePercentage()
    {
        float fPercentage = 0.0f;

        if(this.iTotal == 0)
        {
            System.out.println("Invalide Input");
            return 0.0f;
        }

        fPercentage = ((fMarks / (float)iTotal) * 100);
        return fPercentage;
    }
}

class Program6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float fObtainedMark = 0.0f, fAns = 0.0f;
        int iTotalMark = 0;

        System.out.println("Enter Your Obtained Mark : ");
        fObtainedMark = sobj.nextFloat();

        System.out.println("Enter Your Total Mark : ");
        iTotalMark = sobj.nextInt();

        Calculate cobj = new Calculate(fObtainedMark,iTotalMark);
        fAns = cobj.calculatePercentage();

        System.out.println("Percentage is : "+fAns+"%");

        sobj.close();

    }
}