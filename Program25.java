// Write a program that accepts an integer from the user and displays all its factors (excluding the number itself).

import java.util.*;

class FactorChecker
{
        public int iNo;

        public FactorChecker(int A)
        {
            this.iNo = A;
        }

        public void checkFactor()
        {
            int iCnt = 0;

            System.out.println("Factors are : ");
            for(iCnt = 1; iCnt <= iNo/2; iCnt++)
            {
                if((iNo % iCnt) == 0)
                {
                    System.out.println(iCnt);
                }
            }
        }
}

class Program25
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the First Number");
        iValue = sobj.nextInt();

        FactorChecker fobj = new FactorChecker(iValue);
        fobj.checkFactor();

        sobj.close();

    }
}